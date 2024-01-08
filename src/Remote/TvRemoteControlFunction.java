package Remote;

public class TvRemoteControlFunction implements ITvRemoteControllable, IProgramControllable {

    public void Remote() {}
    public int volume = 10;
    public int maxVolume=100;
    public int minVolume=0;

    @Override
    public void tvOn() { System.out.println("tv를 켭니다");
    }

    @Override
    public void tvOff() {
        System.out.println("tv를 끕니다");
    }

    @Override
    public void volumeUp() {
        if (volume>= maxVolume){
            System.out.printf("볼륨을 올릴 수 없습니다. \n최대 볼륨은 %d입니다.\n",  maxVolume);
            return;
        }
        System.out.println("볼륨을 1 올립니다");
        volume++;
        System.out.printf("현재 볼륨 = %d 입니다 \n", volume);
    }

    @Override
    public void volumeDown() {
        if (volume<=minVolume){
            System.out.printf("볼륨을 내릴 수 없습니다. \n최소 볼륨은 %d입니다.\n", minVolume);
            return;
        }
        System.out.println("볼륨을 1 내립니다");
        volume--;
        System.out.printf("현재 볼륨 = %d 입니다 \n", volume);
    }

    @Override
    public void programOn() {
        System.out.println("프로그램을 시작합니다");
    }

    @Override
    public void programOff() {
        System.out.println("프로그램을 종료합니다.");
    }
}
