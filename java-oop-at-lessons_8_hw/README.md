# Проект автоматизации тестирования главного сайта Geekbrains

Автотесты написаны на сайт https://geekbrains.ru/

## Используемые библиотеки
Selenium Java » 3.141.59
JUnit Jupiter (Aggregator) » 5.6.2
Hamcrest » 2.2
Allure JUnit 5 Integration » 2.13.5
WebDriverManager » 4.1.0
Project Lombok » 1.18.12

## Установленные плагины
Allure Maven » 2.10.0
Maven Surefire Plugin » 2.22.2
AspectJ Weaver » 1.9.4

## Запуск проекта
mvn clean test allure:serve

### Реализованы тесты
AuthorizationWebTest Проверка авторизации на сайте и  название страницы "Главная"
BlogWebTest Проверка отображения элементов меню страницы Блог: "Программирование", "Маркетинг", "Дизайн", "Управление", "Истории студентов", "GeekUniversity" 

CourseWebTest Проверка отображения блока Курсы и фильтра "Бесплатные" и "Тестирование" и отображения курсов"Тестирование ПО. Уровень 1", "Тестирование ПО. Уровень 2"

LeftNavigationWebTest Проверка элементов левого бокового меню 

SearchWebTest Ввод в поиск ключивого слова java и проверка колличества отображаемого контента

### Authors
Александр Тимофеев, altim4@yandex.ru
