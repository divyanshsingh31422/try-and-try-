@echo off
setlocal enabledelayedexpansion

REM -------------------------
REM 1) Initialize repo
REM -------------------------
git init

REM -------------------------
REM 2) Create folders
REM -------------------------
mkdir java
mkdir python


REM -------------------------
REM 3) Create Java files
REM -------------------------
echo // Two Sum > java/TwoSum.java
echo // Best Time Stock > java/BestTimeStock.java
echo // Valid Anagram > java/ValidAnagram.java
echo // Reverse Linked List > java/ReverseLinkedList.java
echo // Merge Two Lists > java/MergeTwoSortedLists.java
echo // Valid Parentheses > java/ValidParentheses.java
echo // Binary Search > java/BinarySearch.java
echo // Climb Stairs > java/ClimbStairs.java
echo // Maximum Subarray > java/MaximumSubarray.java
echo // Move Zeroes > java/MoveZeroes.java


REM -------------------------
REM 4) Create Python files
REM -------------------------
echo # Reverse Array > python/reverse_array.py
echo # Find Max > python/find_max.py
echo # Palindrome > python/palindrome.py
echo # Frequency > python/frequency.py
echo # Stack > python/stack.py
echo # Queue > python/queue.py
echo # Linear Search > python/linear_search.py
echo # Binary Search > python/binary_search.py
echo # Fibonacci > python/fibonacci.py
echo # Bubble Sort > python/bubble_sort.py



REM -------------------------
REM 5) Pick 20 random days
REM -------------------------
set days=
set count=0

:pickdays
if !count! GEQ 20 goto startcommits

set /a d=%random% %% 31 + 1

for %%x in (!days!) do (
    if %%x==!d! goto pickdays
)

set days=!days! !d!
set /a count+=1
goto pickdays


:startcommits
echo Random Days Chosen: !days!


REM -------------------------
REM 6) Create commits for each day
REM -------------------------
for %%d in (!days!) do (

    REM 1–3 commits per day
    set /a c=%random% %% 3 + 1

    for /l %%i in (1,1,!c!) do (

        REM random file (1 to 20)
        set /a f=%random% %% 20 + 1

        if !f! LEQ 10 (
            echo // update %%d-%%i >> java/File%%f.java
        ) else (
            echo # update %%d-%%i >> python/File%%f.py
        )

        git add .
        git commit --date="2025-10-%%d 10:%%i:00" -m "Commit %%i on Oct %%d"
    )
)



git branch -M main

REM -------------------------
REM 7) Add remote URL
REM -------------------------
git remote add origin https://github.com/divyanshsingh31422/try-and-try-.git
