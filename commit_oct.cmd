@echo off
setlocal enabledelayedexpansion

REM --- CLEAN ---
rmdir /s /q java
rmdir /s /q python

mkdir java
mkdir python

REM --- BASE FILES ---
echo // Java base file > java/base.java
echo # Python base file > python/base.py

REM ---- RANDOM 20 DAYS ----
set days=
set count=0

:pick
if !count! GEQ 20 goto doCommits
set /a d=%random% %% 31 + 1
for %%x in (!days!) do if %%x==!d! goto pick
set days=!days! !d!
set /a count+=1
goto pick

:doCommits

git add .
git commit -m "Initial base setup"

for %%d in (!days!) do (
    echo update %%d >> java/update_%%d.java
    echo update %%d >> python/update_%%d.py

    git add .
    git commit --date="2025-10-%%d 12:00:00" -m "Commit for Oct %%d"
)

git branch -M main

git remote remove origin >nul 2>&1
git remote add origin https://github.com/divyanshsingh31422/try-and-try-.git

echo DONE
