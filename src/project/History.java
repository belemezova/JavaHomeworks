package project;

import java.util.Collection;

public class History {

  public Collection<Player> terrorist;
  public Collection<Player> counterTerrorist;
  public Player topPlayer; //(player with max kills),  For each round can be different player
  public int terroristNumberOfRoundsWin;
  public int counterTerroristNumberOfRoundsWin;
}
/*Counter Strike Project
Необходими класове:

Counter Terrorist bonus: weapon dmg +10
Terrorist bonus: health + 20 (тоест началната им кръв е 120)
Описание на функционалността:



Зареждат се (10 оръжия + 1нож(който се използва когато играча няма пари за оръжие)) и 5 vest.
Пада се random число [5-10] което ще репрезентира броя да играчите от отбор тоест ако се
падне 5 ще има общо 10 играча 5(Counter Terrorist) и 5(Terrorist).
Зареждат се играчите като те са randomTeamNumber*2
Всеки играч се разпределя на случаен принцип в кой от 2 отбора ще бъде.
Всеки играч започва с random пари [1000-2000]
Действия които да се случат (на рунд):
В началото на рунда на всеки играч се пада рандом Weapon (Тоест си купува оръжие)
Като трябва да се провери дали ще има достатъчно пари и ако има от неговите пари се вади
цената на оръжието.Ако няма достатъчно пари за оръжието което му се е паднало се пробва
пак с друго random оръжие като ако и за другото няма пари действието се повтаря до 5 опита
ако и за 5 опита няма пари той ще играе с нож.
Освен Оръжие му се пада и random Vest
Като трябва да се провери дали ще има достатъчно пари и ако има от неговите пари се вади
цената на жилетката(Vest). Ако няма достатъчно пари за Vest който му се е паднал се пробва
пак с друг random Vest като ако и за другия няма пари действието се повтаря до 3 опита ако и
за 3 опита няма пари той ще играе с без жилетка.
Ако играча играе с нож стъпката с падането на рандом жилетка се пропуска тъй като той явно е
в лошо финансово състояние.
След като всички са си купили оръжия и жилетки започват бойните действия:
Пада се random число [0-1] с което се определя кой отбор ще започне да стреля пръв.
Например:
0 -> Counter Terrorist 1-> Terrorist
Например пада се 0
От отбора на Counter Terrorist се пада случаен играч който на случаен принцип ще стреля срещу
случаен играч от отбора на Terrorist.
Като от hp на нападнатият (Terrorist) се вади dmg на Weapon на нападателя (Counter Terrorist)
Като първо dmg се вади от defense на Vest (Ако изобщо има жилетка и това трябва да се
проверява).Ако defense стане на – числото под – се вади от hp и играча остава с defense 0.
После действието се повтаря само че от страна на другия отбор (Terrorist в примера)
Играч умира когато hp му падне под 0 (Тоест умрял ли е този рунд повече не трябва да може да
атакува или да бъде атакуван).
Губи рунда отбора който остане с 0 живи играчи пръв съответно другия печели.
За всеки играч се пази статистика в полетата: numberOfKills и numberOfDeads
И съответно статистика за terroristNumberOfRoundsWin и counterTerroristNumberOfRoundsWin в
class History.
Живите Играчи от печелившия отбор запазват оръжието и жилетката си и за следващият рунд
тоест не е нужно да си купуват оръжие и трябва да бъдат изключени от random.Ако обаче
Жилетката им е на 0 ще участват само в random за закупуване на нова жилетка.
Когато някой играч убие друг играч той печели random сума от [300-500]
Всеки играч от печелившия отбор печели по 1000$ в края на рунда
Всеки играч от загубилия отбор печели по 500$ в края на рунда
Да се покаже на конзолата с Зелен цвят името на най-добрия играч за този рунд (topPlayer).
Преди започване на другия рунд кръвта на всички играчи се възстановява.
Горните действия се повтарят и в другите рундове.
Печели отбора който пръв достигне 10 победи (в рундовете)
В конзолата да се показват действията които се случват в играта по всяко време.
--------------------------------------------------------------------------------------------------------------------------------------
Бонус Условия за по-надъханите:
Направете така че когато на даден играч му дойде ред да стреля да се пада рандом чило което
ще отговаря на това колко пъти ще стреля.
Направете статистика за асистенции(assists) на всеки играч.
В началото оръжията,жилетките и играчите да се зареждат от файл където са предварително
запазени.
След като играта приключи покажете на екрана играча с най-много убийства и най-малко
умирания.
Може да добавяте полета(атрибути) в класовете Player, Weapon, Vest, Role, History ако са ви
нужни.
Може да добавяте класове,интерфейси,абстрактни класове ако са ви нужни.*/