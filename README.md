# Tennis TDD 후기

먼저 요구 사항을 보고, 테스트 케이스를 만들기 위해 예제부터 떠올랐다. **요구사항을 그대로 테스트 케이스로 옮겨적어서 TDD를 하기가 쉽지 않았다.**
그래서 처음에는 테스트 케이스를 다음과 같이 썼다.

- 스코어가 0:0이면 Love : Love로 표시된다.
- 스코어가 1:2이면 Fifteen : Thirty로 표시된다.
- 스코어가 3:3이면 Deuce로 표시된다.
- 스코어가 4:3이면 Advantage로 표시된다.
- 스코어가 4:4이면 Deuce로 표시된다.
- 스코어가 4:2이면 A Win, 2:4이면 B Win으로 표시된다.

**이렇게 하니 TDD를 하는게 좀더 쉬웠다.** 그리고 이 테스트 케이스들을 통과하기 위해 구현 코드에는 논리 연산자가 추가 되었다. 그리고 나는 비슷한 테스트 케이스를 계속해서 추가하려고 했다.

- 스코어가 5:6이면 Advantage로 표시된다.
- 스코어가 5:5이면 Deuce로 표시된다.
- 스코어가 5:7이면 A Win, 7:5이면 B Win으로 표시된다.

추가하려다가 문득, 비슷한 **테스트 케이스들이 반복**되고 있고 이 **테스트 케이스들을 추상화**해서 다음과 같이 적을 수 있음을 알게 되었다.

- "스코어가 0:0이면 Love : Love로 표시된다."
- "스코어가 1:2이면 Fifteen : Thirty로 표시된다."
- "각 플레이어의 점수가 3점 이상이고 동점이면 Deuce로 표시된다."
- "각 플레이어의 점수가 3점 이상이고 1점차가 나면 Advantage로 표시된다."
- "한 플레이어의 점수가 4점 이상이고 상대편 플레이어보다 2점 높으면 승리한다."

이 테스트 케이스들은 **구현 코드의 논리 연산자를 보고 떠올린 문장**이고, 신기하게도 **초기의 요구 사항과 닮게 되었다.** 테스트 케이스가 늘어나는 대신 각 케이스에 assertion들을 추가하였다.  
처음부터 요구사항을 그대로 테스트 케이스로 옮겨서 TDD를 할 수도 있었겠지만 **나에겐 너무 어려운 과정**이었다.

1. 요구 사항으로부터 예제를 먼저 떠올리고
2. 예제를 테스트 케이스로 추가하면서 TDD를 하고
3. 구현된 코드를 보면서 테스트 케이스들을 다시 추상화 한다.
4. 최종적으로 완성된 테스트 케이스들은 요구사항과 닮게 된다.

이 방법대로 하는 것이 TDD를 좀 더 쉽고 빠르게 할 수 있었다.
