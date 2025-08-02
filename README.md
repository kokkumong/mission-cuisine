# Mission-Cuisine
## 기능
### 기본
- 재료를 입력한다.
- 많은 재료에 가중치를 부여한다.
- 만들 수 있는 요리를 보여줘야한다.

#### Controller
- RecipeController
    - 레시피 csv 파일을 여기로 불러와야함. 
    - 레시피 파일에 있는 ingredient_id랑 매치된 재료의 id랑 같은 레시피를 찾기 
    - 찾은 레시피의 cuisine id를 리턴하는 함수를 구현 -> CuisineController로 보내기
- IngredientController
  - InputView에서 입력받은 문자열을 split후 String 타입으로 List로 저장.
  - 재료 csv 파일을 불러온다.
  - 모든 재료들에 대해서 입력 받은 재료가 매칭이 되는 경우, Ingredient 타입으로 List에 저장
- CuisineController
  - cuisine csv 파일을 불러온다.
  - RecipeController에서 cuisine_id를 리턴하는 함수를 이용한다. -> 해당하는 cuisine의 이름을 리턴하는 함수를 구현한다.
### 응용
- 가
- 나
- 다
## 아키텍쳐
MVC 사용
##