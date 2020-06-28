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
2. Выполнен запуск тестов