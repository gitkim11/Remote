package Remote;

import java.util.Scanner;

public class RemoteSimulation extends TvRemoteControlFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean off_flag = false;

        TvRemoteControlFunction tvRemoteFunc = new TvRemoteControlFunction();
        AcRemoteControlFunction acRemoteFunc = new AcRemoteControlFunction();
        User user = new User();

        System.out.println("고객님의 성함과 나이를 적어주세요");
        System.out.println("이름 : ");
        String userName = user.getName();
        System.out.println("나이 : ");
        int userAge = user.getAge();
        System.out.printf("%s (%d) 고객님, 접속을 환영합니다. \n", userName, userAge);

        System.out.println("실행시키고 싶은 기능의 숫자를 입력해주세요");
        System.out.println(("1. tv | 2. 에어컨"));
        int funNum = scanner.nextInt();

        while (!off_flag) {


            if (funNum == 1) {
                System.out.println("1. 프로그램 On | 2. tv 켜기 | 3. tv 끄기 | 4. 볼륨올리기 | 5. 볼륨내리기 | 6. 프로그램 Off ");
                int tvNum = scanner.nextInt();

                switch (tvNum) {
                    case 1:
                        tvRemoteFunc.programOn();
                        break;
                    case 2:
                        tvRemoteFunc.tvOn();
                        break;
                    case 3:
                        tvRemoteFunc.tvOff();
                        break;
                    case 4:
                        tvRemoteFunc.volumeUp();
                        break;
                    case 5:
                        tvRemoteFunc.volumeDown();
                        break;
                    case 6:
                        tvRemoteFunc.programOff();
                        System.out.printf("%s (%d) 고객님의 접속을 종료합니다.", userName, userAge);
                        off_flag = true;
                        break;
                }
            }

            else if (funNum == 2) {

                    System.out.println("1. 프로그램 On | 2. 에어컨 켜기 | 3. 에어컨 끄기 | 4. 온도올리기 | 5. 온도내리기 | 6. 프로그램 Off ");
                    int acNum = scanner.nextInt();

                    switch (acNum) {
                        case 1:
                            acRemoteFunc.programOn();
                            break;
                        case 2:
                            acRemoteFunc.acOn();
                            break;
                        case 3:
                            acRemoteFunc.acOff();
                            break;
                        case 4:
                            acRemoteFunc.tempUp();
                            break;
                        case 5:
                            acRemoteFunc.tempDown();
                            break;
                        case 6:
                            acRemoteFunc.programOff();
                            System.out.printf("%s (%d) 고객님의 접속을 종료합니다.", userName, userAge);
                            off_flag = true;
                            break;
                    }
                }

        }
    }
}



