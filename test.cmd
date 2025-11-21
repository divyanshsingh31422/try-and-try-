@echo off
git init

echo // test line >> test.java

git add .
git commit -m "test commit"

git branch -M main

git remote add origin https://github.com/divyanshsingh31422/try-and-try-.git
