Тестовое задание выполнил Матвейчук А.С. на позицию QA.

Задание выполнино с использованием Selenium, Allure, TestNG, Maven и Page Object.

тз №2.1 в файле FilterTest

тз №2.2 в файле AddToFavoriteListTest, в случае запуска ниобходимо вписать значения в login/password.

2.1. Дана страница продаж авто в России http://auto.drom.ru/ Отфильтровать список
объявлений по параметрам:

1)Фирма автомобиля Toyota;

2)Марка автомобиля Harrier;

3)Гибрид;

4)Непроданные;

5)Пробег авто больше 1 км;

6)Год выпуска от 2007.

Проверять, что на первой и второй страницах результатов поиска в списке
объявлений:

1)Нет проданных авто (отсутствует перечеркнутый текст);

2)Год авто не меньше 2007;

3)У каждого объявления в списке есть пробег.


2.2. Написать тест, который авторизует пользователя в разделе продаж авто
http://auto.drom.ru/ и добавляет объявление о продаже авто в избранное.


2.3. Дана страница http://auto.drom.ru/ В сером блоке фильтрации по объявлениям
есть выпадающие списки &quot;Фирма&quot; и &quot;Модель&quot;. В скобках напротив каждого пункта
выпадающего списка указано количество объявлений по данной фирме или модели.
Необходимо написать скрипт, который выводит список из 20 фирм с наибольшим
количеством поданных объявлений в Приморском крае. Данные вывести в виде
таблицы с двумя столбцами как указано на примере ниже.

| Фирма | Количество объявлений |

| Toyota | 17211 |
