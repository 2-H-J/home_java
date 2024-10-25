package e05_anonyumous;

//익명클래스
public class AnimalMain {
    public static void eat(Animal animal){
        animal.eat();
    }

    public static void main(String[] args) {
        Animal animal = new Animal() {

            @Override
            public void eat() {
                System.out.println("동물이 먹이 먹습니다.");
            }
        };
        animal.eat();

        Animal person = new Animal() {
            @Override
            public void eat() {
                System.out.println("사람이 밥을 먹습니다.");
            }
        };
        person.eat();

        System.out.println("-------------------------------------------");

        eat(animal);
        eat(person);
        
        eat(new Animal() {
            @Override
            public void eat() {
                System.out.println("개가 사료를 먹습니다");
            }
        });
    }
}
