package org.fominsky.service;

import java.util.ArrayList;
import java.util.List;

public class Professions {

    public static List<Profession> calculateDamnedProfessions(List<Double> competences) {
        List<Profession> list = new ArrayList<>();

    Profession urbanistEcoligist = new Profession();
    urbanistEcoligist.name = "Урбанист-эколог";
    urbanistEcoligist.description = "Проектировщик новых городов на основе экологических биотехнологий; " +
            "специализируется в областях строительства, энергетики и контроля загрязнения среды.";
    urbanistEcoligist.conformity = Tools.percentage(competences.get(0)+competences.get(6)+competences.get(1)+competences.get(9)+competences.get(7)+competences.get(8))/6;
    urbanistEcoligist.maxConformity = Tools.percentage(competences.get(0)+competences.get(6)+competences.get(1)+1.0+competences.get(7)+1.0)/6;
    urbanistEcoligist.explanation = "Для более успешной реализации себя в этой профессии вы можете повысить свой уровень коммуникабельности, а также получить образование и опыт работы в сфере менеджмента.";
    list.add(urbanistEcoligist);

    Profession healthyAgingConsultant = new Profession();
        healthyAgingConsultant.name = "Консультант по здоровой старости";
        healthyAgingConsultant.description = "Специалист медико-социальной сферы, разрабатывающий оптимальные " +
                "решения по проблемам стареющего населения, например, образ жизни, питание, физические нагрузки и др.";
        healthyAgingConsultant.conformity = Tools.percentage(competences.get(0)+competences.get(2)+competences.get(3)+competences.get(5)+competences.get(7)+competences.get(8))/6;
        healthyAgingConsultant.maxConformity = Tools.percentage(competences.get(0)+competences.get(2)+competences.get(3)+competences.get(5)+competences.get(7)+1.0)/6;
        healthyAgingConsultant.explanation = "Для более успешной реализации себя в этой профессии вы можете повысить свой уровень коммуникабельности.";
        list.add(healthyAgingConsultant);

    Profession microgenerationSystemsDeveloper = new Profession();
        microgenerationSystemsDeveloper.name = "Разработчик систем микрогенерации";
        microgenerationSystemsDeveloper.description = "Специалист по разработке и проектированию новых технологических решений, " +
                "связанных с микрогенерацией энергии под требования пользователя.";
        microgenerationSystemsDeveloper.conformity = Tools.percentage(competences.get(0)+competences.get(6)+competences.get(2)+competences.get(9)+competences.get(1)+competences.get(3)+competences.get(7))/7;
        microgenerationSystemsDeveloper.maxConformity = Tools.percentage(competences.get(0)+competences.get(6)+competences.get(2)+1.0+competences.get(1)+competences.get(3)+competences.get(7))/7;
        microgenerationSystemsDeveloper.explanation = "Для более успешной реализации себя в этой профессии вы можете получить образование и опыт работы в сфере менеджмента.";
        list.add(microgenerationSystemsDeveloper);

    Profession electricityConsumerRightsDefender = new Profession();
        electricityConsumerRightsDefender.name = "Защитник прав потребителей электроэнергии";
        electricityConsumerRightsDefender.description = "Специалист, который проверяет энергетические сети на соответствие показателям безопасности, эффективности и другим пользовательским " +
                "требованиям и который способен дать квалифицированную консультацию в сфере законодательства по энергосбережению.";
        electricityConsumerRightsDefender.conformity = Tools.percentage(competences.get(0)+competences.get(3)+competences.get(7)+competences.get(4)+competences.get(8))/5;
        electricityConsumerRightsDefender.maxConformity = Tools.percentage(competences.get(0)+competences.get(3)+competences.get(7)+competences.get(4)+1.0)/5;
        electricityConsumerRightsDefender.explanation = "Для более успешной реализации себя в этой профессии вы можете повысить свой уровень коммуникабельности.";
        list.add(electricityConsumerRightsDefender);

    Profession smartRoadBuilder = new Profession();
        smartRoadBuilder.name = "Строитель \"Умных дорог\"";
        smartRoadBuilder.description = "Это специалист, который выбирает и устанавливает дорожное адаптивное покрытие, разметку и дорожные знаки с радиочастотной идентификацией, " +
                "системы наблюдения и датчики для контроля состояния дороги.";
        smartRoadBuilder.conformity = Tools.percentage(competences.get(1)+competences.get(2)+competences.get(9))/3;
        smartRoadBuilder.maxConformity = Tools.percentage(competences.get(1)+competences.get(2)+1.0)/3;
        smartRoadBuilder.explanation = "Для более успешной реализации себя в этой профессии вы можете получить образование и опыт работы в сфере менеджмента.";
        list.add(smartRoadBuilder);

    Profession arcticNavigationSpecialist = new Profession();
        arcticNavigationSpecialist.name = "Специалист по навигации в условиях Арктики";
        arcticNavigationSpecialist.description = "Это специалист, который хорошо понимает особенности ледовой навигации в условиях Крайнего Севера, " +
        "умеет прокладывать оптимальные маршруты для плавательных средств и принимать быстрые решения об их изменении в нестандартных ситуациях.";
        arcticNavigationSpecialist.conformity = Tools.percentage(competences.get(0)+competences.get(2)+competences.get(7)+competences.get(4))/4;
        arcticNavigationSpecialist.maxConformity = Tools.percentage(competences.get(0)+competences.get(2)+competences.get(7)+competences.get(4))/4;
        arcticNavigationSpecialist.explanation = "Компетенции, необходимые для этой профессии, целиком основываются на врождённых способностях. Вы не можете добрать больше баллов.";
        list.add(arcticNavigationSpecialist);

    Profession smallAircraftProductionEngineer = new Profession();
        smallAircraftProductionEngineer.name = "Инженер производства малой авиации";
        smallAircraftProductionEngineer.description = "Специалист, который занимается проектированием и моделированием дешевых летательных аппаратов малой гражданской авиации различной сложности.";
        smallAircraftProductionEngineer.conformity = Tools.percentage(competences.get(0)+competences.get(2)+competences.get(1)+competences.get(9)+competences.get(3))/5;
        smallAircraftProductionEngineer.maxConformity = Tools.percentage(competences.get(0)+competences.get(2)+competences.get(1)+1.0+competences.get(3))/5;
        smallAircraftProductionEngineer.explanation = "Для более успешной реализации себя в этой профессии вы можете получить образование и опыт работы в сфере менеджмента.";
        list.add(smallAircraftProductionEngineer);

    Profession onlineCommunitiesOrganizer = new Profession();
        onlineCommunitiesOrganizer.name = "Организатор интернет-сообществ";
        onlineCommunitiesOrganizer.description = "Специалист по организации и модерированию электронных форумов, игровых и образовательных площадок в Сети.";
        onlineCommunitiesOrganizer.conformity = Tools.percentage(competences.get(1)+competences.get(2)+competences.get(3)+competences.get(7)+competences.get(8))/5;
        onlineCommunitiesOrganizer.maxConformity = Tools.percentage(competences.get(1)+competences.get(2)+competences.get(3)+competences.get(7)+1.0)/5;
        onlineCommunitiesOrganizer.explanation = "Для более успешной реализации себя в этой профессии вы можете повысить свой уровень коммуникабельности.";
        list.add(onlineCommunitiesOrganizer);

    Profession multifunctionalRoboticSystemsOperator = new Profession();
        multifunctionalRoboticSystemsOperator.name = "Оператор многофункциональных робототехнических комплексов";
        multifunctionalRoboticSystemsOperator.description = "Специалист по управлению и обслуживанию роботизированных систем на сложных и опасных производствах и при работе с труднодоступными или микрообъектами.";
        multifunctionalRoboticSystemsOperator.conformity = Tools.percentage(competences.get(0)+competences.get(1)+competences.get(4))/3;
        multifunctionalRoboticSystemsOperator.maxConformity = Tools.percentage(competences.get(0)+competences.get(1)+competences.get(4))/3;
        multifunctionalRoboticSystemsOperator.explanation = "Компетенции, необходимые для этой профессии, целиком основываются на врождённых способностях. Вы не можете добрать больше баллов.";
        list.add(multifunctionalRoboticSystemsOperator);

    Profession personalBrandManager = new Profession();
        personalBrandManager.name = "Персональный бренд-менеджер";
        personalBrandManager.description = "Cпециалист, занимающийся формированием персонального имиджа с использованием социальных сетей " +
                "и других публичных площадок в соответствии с целями и требованиями заказчика";
        personalBrandManager.conformity = Tools.percentage(competences.get(3)+competences.get(7)+competences.get(5)+competences.get(8))/4;
        personalBrandManager.maxConformity = Tools.percentage(competences.get(3)+competences.get(7)+competences.get(5)+1.0)/4;
        personalBrandManager.explanation = "Для более успешной реализации себя в этой профессии вы можете повысить свой уровень коммуникабельности.";
        list.add(personalBrandManager);

    Profession migrantAdaptationSpecialist = new Profession();
        migrantAdaptationSpecialist.name = "Специалист по адаптации мигрантов";
        migrantAdaptationSpecialist.description = "Профессионал, который обучает национальному языку и культуре, в том числе через онлайн-платформы.";
        migrantAdaptationSpecialist.conformity = Tools.percentage(competences.get(1)+competences.get(7)+competences.get(8))/3;
        migrantAdaptationSpecialist.maxConformity = Tools.percentage(competences.get(1)+competences.get(7)+1.0)/3;
        migrantAdaptationSpecialist.explanation = "Для более успешной реализации себя в этой профессии вы можете повысить свой уровень коммуникабельности.";
        list.add(migrantAdaptationSpecialist);

    Profession tutor = new Profession();
        tutor.name = "Тьютор";
        tutor.description = "Педагог, сопровождающий индивидуальное развитие учащихся в рамках дисциплин, формирующих образовательную программу, " +
                "прорабатывающий индивидуальные задания, рекомендующий траекторию карьерного развития.";
        tutor.conformity = Tools.percentage(competences.get(0)+competences.get(6)+competences.get(2)+competences.get(3)+competences.get(8))/5;
        tutor.maxConformity = Tools.percentage(competences.get(0)+competences.get(6)+competences.get(2)+competences.get(3)+1.0)/5;
        tutor.explanation = "Для более успешной реализации себя в этой профессии вы можете повысить свой уровень коммуникабельности.";
        list.add(tutor);

    Profession gamingTeacher = new Profession();
        gamingTeacher.name = "Игропедагог";
        gamingTeacher.description = "Специалист, который создает образовательные программы на основе игровых методик, " +
                "выступает игровым персонажем .В школах будет замещать традиционного учителя.";
        gamingTeacher.conformity = Tools.percentage(competences.get(6)+competences.get(5)+competences.get(7)+competences.get(8))/4;
        gamingTeacher.maxConformity = Tools.percentage(competences.get(6)+competences.get(5)+competences.get(7)+1.0)/4;
        gamingTeacher.explanation = "Для более успешной реализации себя в этой профессии вы можете повысить свой уровень коммуникабельности.";
        list.add(gamingTeacher);

    Profession timeBroker = new Profession();
        timeBroker.name = "Тайм-брокер";
        timeBroker.description = "Специалист, «продающий»  рабочее время специалистов, находящихся в режиме свободной занятости, то есть управляющий чужой занятостью на открытом рынке. " +
                "Эта специальность на дальнем горизонте пропадает ввиду появления автоматизированных решений.";
        timeBroker.conformity = Tools.percentage(competences.get(6)+competences.get(3)+competences.get(7)+competences.get(8))/4;
        timeBroker.maxConformity = Tools.percentage(competences.get(6)+competences.get(3)+competences.get(7)+1.0)/4;
        timeBroker.explanation = "Для более успешной реализации себя в этой профессии вы можете повысить свой уровень коммуникабельности.";
        list.add(timeBroker);

    return list;
}

    /*
    Список в org.fominsky.competences:
    0.	системное мышление
    1.	программирование
    2.	управление проектами
    3.	клиентоориентированность
    4.	работа в условиях неопределённости
    5.	творчество
    6.	межотраслевые коммуникации
    7.	мультикультурность
    8.	работа с людьми
    9.	бережливое производство
     */
}
