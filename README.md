# Базовый репозиторий задания по системе сборки Gradle

## Инструкция
1. Сделайте [fork](https://docs.github.com/en/get-started/quickstart/fork-a-repo) репозитория
2. Настройте систему сборки  [gradle](https://gradle.org/) так, чтобы в проекте проходили тесты. Модифицировать код проекта **нельзя**.
    * [Работа с gradle в IDEA](https://www.jetbrains.com/help/idea/gradle.html)
3. Конфигурация системы сборки должна содержать следующие элементы:
   1. Сборка осуществляется компилятором языка Kotlin версии 1.6.10
   2. Поиск зависимостей осуществляется в репозитории `mavenCentral`
   3. Для всего проекта  подключены следующие зависимости:
      * Стандартная библиотека языка Kotlin `kotlin-stdlib-jdk8` последней доступной версии
      * Библиотека `Guava` версии `31.0.1-jre`
   4. Для тестов подключена библиотека `kotlin-test-junit5` последней доступной версии
   5. Задача запуска тестов использует для тестирования платформу JUnit
4. Перед сдачей своего решения убедитесь, что
   при запуске команды `./gradlew build` (или `./gradlew test`) в папке `build/test-results/test` генерируется xml файл
   с отчетом о выполненных тестах. Пример успешного выполнения команды `./gradlew build`:
   ```shell
   BUILD SUCCESSFUL in 7s
   7 actionable tasks: 7 executed
   ```
   В той же директории, в которой у вас находится файл `build.gradle` (или `build.gradle.kts`), должна появиться директория `build`.
   В результате выполнения команды `./gradlew build` должен сгенерироваться файл с именем `build/test-results/test/TEST-myapp.test.Test.xml`,
   где `myapp.test.Test` &mdash; имя вашего тестового класса. Если тестовых классов несколько, то для каждого из них генерируется отдельный отчет.
5. Чтобы сдать задание откройте [pull request](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/creating-a-pull-request-from-a-fork)
    * В качестве `base repository` выберите этот (базовый) репозиторий. В качестве ветки `base` выберите ветку `main`
    * В качестве `head repository` выберите ваш репозиторий (fork). В качестве ветки `compare` выберите ветку 'main'
    * В заголовке PR укажите ваше имя и номер группы
    * например, "Иванов И.И.', гр. 3530901/00006"
