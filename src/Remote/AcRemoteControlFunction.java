package Remote;

public class AcRemoteControlFunction implements IAcRemoteControllable, IProgramControllable {

    int temperature = 20;
    int maxTemperature = 30;
    int minTemperature = 15;

    @Override
    public void acOn() {
        System.out.println("에어컨을 켭니다");

    }

    @Override
    public void acOff() {
        System.out.println("에어컨을 끕니다");
    }

    @Override
    public void tempUp() {
        if (temperature>= maxTemperature){
            System.out.printf("온도를 올릴 수 없습니다. \n최대 온도는 %d°C 입니다.\n",  maxTemperature);
            return;
        }
        System.out.println("온도를 1°C 올립니다");
        temperature++;
        System.out.printf("현재 온도 = %d°C 입니다 \n", temperature);
    }

    @Override
    public void tempDown() {
        if (temperature<=minTemperature){
            System.out.printf("온도를 내릴 수 없습니다. \n최소 온도는 %d°C 입니다.\n", minTemperature);
            return;
        }
        System.out.println("온도를 1°C 내립니다");
        temperature--;
        System.out.printf("현재 온도 = %d°C 입니다 \n", temperature);

    }

    @Override
    public void programOn() {
        System.out.println("프로그램을 시작합니다.");
    }

    @Override
    public void programOff() {
        System.out.println("프로그램을 종료합니다.");
    }
}
