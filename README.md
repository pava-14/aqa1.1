# Задача №2 - JUnit5 и Legacy

## Краткое описание
1. Добавлены зависимости 
```
dependencies {
    testImplementation 'junit:junit:4.13'
    testRuntimeOnly 'org.junit.vintage:junit-vintage-engine:5.6.2'
}

test {
    useJUnitPlatform()
}
```
2. Выполнен запуск тестов.
3. Добавлены зависимости 
  ```
dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.6.1'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.6.1'

    testImplementation 'junit:junit:4.13'
    testRuntimeOnly 'org.junit.vintage:junit-vintage-engine:5.6.2'
}

test {
    useJUnitPlatform()
}
```
4. Написаны тесты, с использованием API JUnit Jupiter.
 