package Remote;

import java.util.Scanner;

public class RemoteExample extends RemoteFunction{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean off_flag = false;
        RemoteFunction remoteFunc = new RemoteFunction();



        while(!off_flag){
            System.out.println("실행시키고 싶은 숫자를 입력해주세요");
            System.out.println("1. 프로그램 On | 2. tv 켜기 | 3. tv 끄기 | 4. 볼륨올리기 | 5. 볼륨 내리기 | 6. 프로그램 Off ");
            int num = scanner.nextInt();

            switch (num){
                case 1:
                    remoteFunc.programOn();
                    off_flag = false;
                    break;
                case 2:
                    remoteFunc.tvOn();
                    break;
                case 3:
                    remoteFunc.tvOff();
                    break;
                case 4:
                    remoteFunc.volumeUp();
                    break;
                case 5:
                    remoteFunc.volumeDown();
                    break;
                case 6:
                    remoteFunc.programOff();
                    off_flag = true;
                    break;
            }
        }
    }
}
