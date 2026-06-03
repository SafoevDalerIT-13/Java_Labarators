

/*
ИСПРАВЛЕНИЯ:
1. Отступы заменены на табуляцию.
2. Все методы переименованы в PascalCase:
   addNewUser -> AddNewUser, deleteUser -> DeleteUser, getPhone -> GetPhone,
   checkExists -> CheckExists, sizeMap -> SizeMap, pairsArray -> PairsArray,
   telephoneArray -> TelephoneArray, nameArray -> NameArray,
   namesArrayStartingWith -> NamesArrayStartingWith.
3. Геттеры возвращают копии коллекций (защита).
4. Добавлены пробелы после запятых.
5. Поля переименованы: telephoneName -> telephoneToName, nameTelephone -> nameToTelephone.
*/
package ru.safoev.fix;

import java.util.*;

/**
 * Представляет телефонный справочник с двунаправленным отображением
 * между телефонными номерами и именами.
 */
public class TelephoneDirectory {
    /** Отображение телефон -> имя */
    private Map<String, String> telephoneToName;
    /** Отображение имя -> телефон */
    private Map<String, String> nameToTelephone;

    /**
     * Создаёт пустой телефонный справочник.
     */
    public TelephoneDirectory() {
        this.telephoneToName = new HashMap<>();
        this.nameToTelephone = new HashMap<>();
    }

    /**
     * Возвращает копию отображения телефон -> имя.
     * @return копия мапы
     */
    public Map<String, String> getTelephoneToName() {
        return new HashMap<>(telephoneToName);
    }

    /**
     * Возвращает копию отображения имя -> телефон.
     * @return копия мапы
     */
    public Map<String, String> getNameToTelephone() {
        return new HashMap<>(nameToTelephone);
    }

    /**
     * Добавляет нового пользователя. Если имя уже существует, обновляет номер.
     * @param telephone номер телефона
     * @param name имя абонента
     * @return старый номер телефона, если имя существовало, иначе null
     * @throws IllegalArgumentException если telephone или name null
     */
    public String AddNewUser(String telephone, String name) {
        if (telephone == null || name == null) {
            throw new IllegalArgumentException("Телефон и имя не могут быть null");
        }
        String oldPhone = null;
        if (nameToTelephone.containsKey(name)) {
            oldPhone = nameToTelephone.get(name);
            telephoneToName.remove(oldPhone);
            nameToTelephone.remove(name);
        }
        telephoneToName.put(telephone, name);
        nameToTelephone.put(name, telephone);
        return oldPhone;
    }

    /**
     * Удаляет пользователя по имени.
     * @param name имя для удаления
     */
    public void DeleteUser(String name) {
        if (nameToTelephone.containsKey(name)) {
            String phone = nameToTelephone.get(name);
            nameToTelephone.remove(name);
            telephoneToName.remove(phone);
        }
    }

    /**
     * Возвращает номер телефона по имени.
     * @param name имя абонента
     * @return номер телефона или null
     */
    public String GetPhone(String name) {
        return nameToTelephone.get(name);
    }

    /**
     * Проверяет существование ключа (телефона или имени) в справочнике.
     * @param key телефон или имя для проверки
     */
    public void CheckExists(String key) {
        boolean isPhone = telephoneToName.containsKey(key);
        boolean isName = nameToTelephone.containsKey(key);
        if (isPhone) {
            System.out.println("Телефон '" + key + "' есть в списке. Имя: " + telephoneToName.get(key));
        } else if (isName) {
            System.out.println("Имя '" + key + "' есть в списке. Телефон: " + nameToTelephone.get(key));
        } else {
            System.out.println("'" + key + "' не найден ни как телефон, ни как имя");
        }
    }

    /**
     * Выводит количество контактов в справочнике.
     */
    public void SizeMap() {
        if (nameToTelephone.isEmpty()) {
            System.out.println("Список пуст!");
        } else {
            System.out.println("Количество контактов: " + nameToTelephone.size());
        }
    }

    /**
     * Возвращает и выводит массив всех пар (телефон, имя).
     * @return двумерный массив пар
     */
    public String[][] PairsArray() {
        int i = 0;
        String[][] pairs = new String[telephoneToName.size()][2];
        if (telephoneToName.isEmpty()) {
            System.out.println("Список пуст!");
        } else {
            for (Map.Entry<String, String> entry : telephoneToName.entrySet()) {
                pairs[i][0] = entry.getKey();
                pairs[i][1] = entry.getValue();
                i++;
            }
        }
        System.out.println("Список всех пар: ");
        for (String[] pair : pairs) {
            System.out.println(pair[0] + " " + pair[1]);
        }
        return pairs;
    }

    /**
     * Возвращает и выводит массив всех номеров телефонов.
     * @return массив телефонов
     */
    public String[] TelephoneArray() {
        String[] telephones = new String[telephoneToName.size()];
        int i = 0;
        for (Map.Entry<String, String> entry : telephoneToName.entrySet()) {
            telephones[i] = entry.getKey();
            i++;
        }
        System.out.println("Список телефонов: ");
        for (String phone : telephones) {
            System.out.println(phone);
        }
        return telephones;
    }

    /**
     * Возвращает и выводит массив всех имён в справочнике.
     * @return массив имён
     */
    public String[] NameArray() {
        String[] names = new String[telephoneToName.size()];
        int i = 0;
        for (Map.Entry<String, String> entry : telephoneToName.entrySet()) {
            names[i] = entry.getValue();
            i++;
        }
        System.out.println("Список имен: ");
        for (String name : names) {
            System.out.println(name);
        }
        return names;
    }

    /**
     * Находит и выводит имена, начинающиеся с указанного префикса (без учёта регистра).
     * @param prefix префикс для поиска
     * @return массив найденных имён
     */
    public String[] NamesArrayStartingWith(String prefix) {
        List<String> matchingNames = new ArrayList<>();
        for (String name : nameToTelephone.keySet()) {
            if (name.toLowerCase().startsWith(prefix.toLowerCase())) {
                matchingNames.add(name);
            }
        }
        String[] result = matchingNames.toArray(new String[0]);
        if (result.length == 0) {
            System.out.println("Имена, начинающиеся с '" + prefix + "' не найдены");
        } else {
            System.out.println("Найдены имена, начинающиеся с '" + prefix + "':");
            for (int i = 0; i < result.length; i++) {
                System.out.println((i + 1) + ". " + result[i]);
            }
        }
        return result;
    }

    /**
     * Возвращает строковое представление справочника.
     * @return форматированный список контактов
     */
    @Override
    public String toString() {
        if (telephoneToName.isEmpty()) return "Телефонный справочник пуст";
        StringBuilder sb = new StringBuilder("Телефонный справочник\n");
        for (Map.Entry<String, String> entry : telephoneToName.entrySet()) {
            sb.append("Номер телефона - ").append(entry.getKey())
                    .append(" Имя - ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}