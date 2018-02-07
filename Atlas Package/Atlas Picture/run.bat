@echo off
:a
timeout /t 0.5 /nobreak > nul
start errorcheck.bat
start run.bat
goto a