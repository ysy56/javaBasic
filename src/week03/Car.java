package week03;

// 클래스를 만들기 위한 4가지 step
// 1. 만들려고 하는 설계도를 선언(클래스 선언)
// 2. 객체가 가지고 있어야할 속성(필드) 정의
// 3. 객체를 생성하는 방식을 정의(생성자 : constructor)
// 4. 객체가 가지고 있어야할 행위(메서드) 정의

public class Car {
    // <<필드영역>>

    // 1) 고유 데이터 영역
    String company; // 자동차 회사
    String model = "Gv80"; // 자동차 모델
    String color; // 자동차 색
    double price; // 자동차 가격

    // 2) 상태 데이터 영역
    double speed; // 자동차 속도, km/h
    char gear; // 기어상태(P, R, N, D)
    boolean lights = true; // 자동차 조명의 상태

    // 3) 객체 데이터 영역
    Tire tire = new Tire();
    Door door;
    Handle handle;

    // <<생성자 영역>>
    // 생성자 : 처음 객체가 생성될 때(instance화) 어떤 로직을 수행해야 하며, 어떤 값이 필수로 들어와야 하는지 정의!
    public Car() {
        // logic
        // 기본 생성자 : 생략이 가능
        System.out.println("Car Constructor");
    }

    // <<메서드 영역>>

    // gasPedal
    // input : kmh
    // output : speed
    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    // breakPedal
    // input : X
    // output : speed
    double breakPedal() {
        speed = 0;
        return speed;
    }

    // changeGear
    // input : gear(char type)
    // output : gear
    char changeGear(char type) {
        gear = type;
        return gear;
    }

    // onOffLight
    // input : X
    // output : lights(boolean)
    boolean onOffLights() {
        lights = !lights;
        return lights;
    }

    // horn
    // input : X
    // output : X
    void horn() {
        System.out.println("빵빵!");
    }

    // 자동차의 속도 ..가변길이 메서드
    void carSpeeds(double ... speeds) {
        for (double speed : speeds) {
            System.out.println("speed: " + speed);
        }
    }
}
