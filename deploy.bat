@echo off
:: Définir les variables de répertoire
set SRC_DIR=C:\Users\Admin\Documents\examenNainaS4
set LIB_DIR=%SRC_DIR%\lib
set WEB_DIR=%SRC_DIR%\src\main\webapp
set CLASSES_DIR=%WEB_DIR%\WEB-INF\classes
set BUILD_DIR=%SRC_DIR%\build
set WAR_FILE=%SRC_DIR%\ETU003230.war
set TOMCAT_WEBAPPS_DIR=C:\Users\Admin\Downloads\apache-tomcat-10.1.39\webapps

:: Créer le répertoire BUILD si nécessaire
if not exist "%BUILD_DIR%" (
    mkdir "%BUILD_DIR%"
)

echo Compiling Connexion.java...
javac -cp "%LIB_DIR%\servlet-api.jar" -d "%CLASSES_DIR%" "%SRC_DIR%\src\main\java\com\itu\hello\Connexion.java"
if %ERRORLEVEL% neq 0 (
    echo Compilation of Connexion.java failed!
    exit /b %ERRORLEVEL%
)

echo Compiling Prevision.java...
javac -cp "%LIB_DIR%\servlet-api.jar;%CLASSES_DIR%" -d "%CLASSES_DIR%" "%SRC_DIR%\src\main\java\com\itu\hello\Prevision.java"
if %ERRORLEVEL% neq 0 (
    echo Compilation of Prevision.java failed!
    exit /b %ERRORLEVEL%
)

echo Compiling PrevisionServ.java...
javac -cp "%LIB_DIR%\servlet-api.jar;%CLASSES_DIR%" -d "%CLASSES_DIR%" "%SRC_DIR%\src\main\java\com\itu\hello\PrevisionServlet.java"
if %ERRORLEVEL% neq 0 (
    echo Compilation of PrevisionServ.java failed!
    exit /b %ERRORLEVEL%
)


echo Compiling Depense.java...
javac -cp "%LIB_DIR%\servlet-api.jar;%CLASSES_DIR%" -d "%CLASSES_DIR%" "%SRC_DIR%\src\main\java\com\itu\hello\Depense.java"
if %ERRORLEVEL% neq 0 (
    echo Compilation of Depense.java failed!
    exit /b %ERRORLEVEL%
)

echo Compiling DepenseServ.java...
javac -cp "%LIB_DIR%\servlet-api.jar;%CLASSES_DIR%" -d "%CLASSES_DIR%" "%SRC_DIR%\src\main\java\com\itu\hello\DepenseServlet.java"
if %ERRORLEVEL% neq 0 (
    echo Compilation of DepenseServ.java failed!
    exit /b %ERRORLEVEL%
)

echo Compiling etat.java...
javac -cp "%LIB_DIR%\servlet-api.jar;%CLASSES_DIR%" -d "%CLASSES_DIR%" "%SRC_DIR%\src\main\java\com\itu\hello\Etat.java"
if %ERRORLEVEL% neq 0 (
    echo Compilation of Etat.java failed!
    exit /b %ERRORLEVEL%
)

echo Compiling etatServ.java...
javac -cp "%LIB_DIR%\servlet-api.jar;%CLASSES_DIR%" -d "%CLASSES_DIR%" "%SRC_DIR%\src\main\java\com\itu\hello\EtatServlet.java"
if %ERRORLEVEL% neq 0 (
    echo Compilation of Etat.java failed!
    exit /b %ERRORLEVEL%
)
echo Compiling user.java...
javac -cp "%LIB_DIR%\servlet-api.jar;%CLASSES_DIR%" -d "%CLASSES_DIR%" "%SRC_DIR%\src\main\java\com\itu\hello\Admin.java"
if %ERRORLEVEL% neq 0 (
    echo Compilation of user.java failed!
    exit /b %ERRORLEVEL%
)
echo Compiling userServ.java...
javac -cp "%LIB_DIR%\servlet-api.jar;%CLASSES_DIR%" -d "%CLASSES_DIR%" "%SRC_DIR%\src\main\java\com\itu\hello\LoginServlet.java"
if %ERRORLEVEL% neq 0 (
    echo Compilation of userServ.java failed!
    exit /b %ERRORLEVEL%
)





:: Etape 1 : Compiler les fichiers Java



:: Etape 2 : Copier les fichiers dans le répertoire de build
echo Copying files to build directory...
xcopy /E /I "%WEB_DIR%" "%BUILD_DIR%"
if %ERRORLEVEL% neq 0 (
    echo Copying files failed!
    exit /b %ERRORLEVEL%
)

:: Etape 3 : Créer le fichier .war
echo Creating the .war file...
cd "%BUILD_DIR%"
jar -cvf "%WAR_FILE%" *
if %ERRORLEVEL% neq 0 (
    echo Failed to create the .war file!
    exit /b %ERRORLEVEL%
)

:: Etape 4 : Déployer le fichier .war dans Tomcat
echo Deploying the .war file to Tomcat...
copy "%WAR_FILE%" "%TOMCAT_WEBAPPS_DIR%"
if %ERRORLEVEL% neq 0 (
    echo Deployment failed!
    exit /b %ERRORLEVEL%
)

:: Fin
echo Deployment successful!
pause
