
Использование команды cat в Linux
-----------------------------------
1.Создание двух текстовых файлов:

Чтобы создать файл "Pets" и перечислить в нем собак, кошек и хомяков, выполним следующую команду в терминале:
>cat > Pets.txt

Затем введем содержимое файла, нажимая Enter после каждой строки:

>собаки
кошки
>хомяки

Чтобы завершить ввод, нажмем Ctrl + D.
Аналогично, чтобы создать файл "Pack animals" и перечислить в нем лошадей, верблюдов и ослов, выполним следующую команду в терминале:

>cat > PackAnimals.txt

Затем введем содержимое файла:

>лошади
>верблюды
>ослы

Чтобы завершить ввод, надо нажать сочетание клавиш Ctrl + D

2.Объединение содержимого файлов:

Чтобы объединить содержимое файлов "Pets" и "Pack animals" в один файл, выполним следующую команду в терминале:

>cat Pets.txt PackAnimals.txt > HumanFriends.txt

3.Просмотр содержимого объединенного файла:

Чтобы просмотреть содержимое файла "Human Friends", выполним следующую команду в терминале:

>cat HumanFriends.txt

Мы увидем объединенное содержимое файлов "Pets" и "Pack animals".
<img width="601" alt="Снимок экрана 2023-10-29 в 21 15 50" src="https://github.com/Rena204/FinalWork2/assets/118428234/a9b9672b-4702-4a0e-b47d-77feffb4ceed">

4.Переименование файла:

Чтобы переименовать файл "HumanFriends.txt" в "Human Friends", выполним следующую команду в терминале:
>mv HumanFriends.txt "Human Friends"

5.Проверка списка файлов:

Чтобы проверить список файлов в текущей директории, выполним следующую команду в терминале:
>ls

Мы должны увидеть список файлов, включая "Human Friends", "PackAnimals.txt" и "Pets.txt".
<img width="602" alt="Снимок экрана 2023-10-29 в 21 16 43" src="https://github.com/Rena204/FinalWork2/assets/118428234/eb854a9b-a0b1-4a69-86dc-a55fd400b6e0">


Работа с директориями в Linux
-----------------------------
1.Создание новой директории:

Чтобы создать новую директорию, выполним следующую команду в терминале:
>mkdir new_directory

2.Перемещение файла в новую директорию:

Чтобы переместить файл "Human Friends" в созданную директорию, выполним следующую команду в терминале:
>mv "Human Friends" new_directory/

<img width="631" alt="Снимок экрана 2023-10-28 в 15 06 02" src="https://github.com/Rena204/FinalWork2/assets/118428234/6ba86071-956e-498c-9f42-51842ec223d5">


Работа с MySQL в Linux
--
Чтобы установить MySQL на Linux, выполним следующие шаги:

1.Подключим дополнительный репозиторий MySQL с помощью следующей команды:

>sudo add-apt-repository mysql-repo

2.Обновим список пакетов с помощью следующей команды:

>sudo apt update

3.Установим один из пакетов MySQL из подключенного репозитория с помощью следующей команды:

>sudo apt install mysql-server
<img width="814" alt="Снимок экрана 2023-10-28 в 15 18 51" src="https://github.com/Rena204/FinalWork2/assets/118428234/155484df-325c-43d0-82fc-f950d8c38d2d">

Управление deb-пакетами
--
Чтобы установить и затем удалить deb-пакет с помощью команды dpkg в Linux, выполним следующие шаги:

1.Для установки deb-пакета введем следующую команду:

>sudo dpkg -i package.deb

Заменим "package.deb" на путь к нашему deb-пакету.

2.Для удаления установленного deb-пакета введем следующую команду:

>sudo dpkg -r package

<img width="807" alt="Снимок экрана 2023-10-28 в 21 49 09" src="https://github.com/Rena204/FinalWork2/assets/118428234/f6992017-5646-4722-95a4-f9c91b4b566a">

