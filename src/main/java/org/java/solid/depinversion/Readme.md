# ISP

I: Interface Segregation Principle (Принцип разделения интерфейса).
Сокращенно пишется ISP

“Нужно создавать такие интерфейсы, в которых описан только необходимый минимум реализаций методов”

Основная мысль – максимально делить (дробить) интерфейсы, но не слишком мелко.

Вместо того, чтобы класс реализовывал один большой интерфейс, лучше пусть реализовывает несколько мелких.

НЕ следует создавать избыточные интерфейсы, которые будут обязывать классы реализовывать то, что им не нужно (не свойственно их поведению). Лучше разбить такой интерфейс на несколько.

## Homework

1. We create IManager interface
2. Create ProductManager class that implements IManager interface
3. Update the main file