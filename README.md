# DAO

## Opis

Projekt przygotowany w ramach warsztatów CodersLab, którego celem było wytworzenie obiektowej warstwy dostępu do bazy danych.
Klasy programu implementują wzorzec projektowy *Data Access Object*. Baza danych tego projektu składa się z jednej tabeli ``users``.

## Klasy

### User

Klasa ``User`` reprezentuje tabelę ``users`` z bazy danych. Klasa ta ma następujące atrybuty odpowiadające kolumnom tabeli:
* ``id`` - identyfikator użytkownika ustawiany przez bazę danych (ustawiony na ``AUTO_INCREMENT``),
* ``userName`` - nazwę użytkownika,
* ``email`` - unikalny adres email użytkownika,
* ``password`` - hasło użytkownika przechowywane w postaci zahaszowanej.

### DbUtil

Klasa ``DbUtil`` odpowiada za połączenie z bazą danych.

### UserDao

W klasie ``UserDao`` znajdują się metody służące do komunikacji z bazą danych.
* Metoda ``create`` przyjmuje nowego użytkownika w postaci obiektu klasy ``User`` z uzupełnionymi atrybutami:
``userName``, ``email`` oraz ``password`` (w postaci niezahaszowanej). Następnie zapisuje użytkownika jako rekord w bazie danych
(hasło zapisywane jest w postaci zahaszowanej).
Ponadto metoda pobiera identyfikator ``id`` nowego użytkownika z bazy danych, wpisuje go do atrybutu obiektu, a także zmienia hasło zapisane w obiekcie z niezahaszowanego na zahaszowane.
Na koniec zwracany jest uaktualniony obiekt.
* Metoda ``read`` przyjmuje identyfikator rekordu, który ma być pobrany z bazy danych. Następnie tworzy obiekt klasy
``User`` i uzupełnia go danymi z pobranego rekordu. Na koniec zwracany jest nowy obiekt.
* Metoda ``update`` przyjmuje obiekt klasy ``User``, który ma uzupełnione wszystkie atrybuty łącznie z ``id`` (hasło jest w postaci niezahaszowanej).
W bazie danych zmieniane są dane dotyczące rekordu o identyfikatorze podanym w obiekcie. Nowe dane użytkownika o podanym ``id``
to dane przekazane w atrybutach obiektu reprezentującego użytkownika. Hasło zostaje zahaszowane przed zapisaniem go w bazie danych
i w takiej formie jest też zapisywane do wejściowego obiektu.
* Metoda ``delete`` przyjmuje identyfikator rekordu, który jest następnie usuwany z bazy danych.
* Metoda ``findAll`` pobiera z bazy danych wszystkie rekordy i z każdego z nich tworzy obiekt klasy ``User``.
Wszystkie obiekty umieszcza w tablicy, którą na koniec zwraca.

### MainDao

W klasie ``MainDao`` na przykładach testowane są metody z klasy ``UserDao``.
