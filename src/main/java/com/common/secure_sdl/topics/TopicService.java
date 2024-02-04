package com.common.secure_sdl.topics;

import com.common.secure_sdl.entities.Topic;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TopicService {

    public List<Topic> getAll() {
        return List.of(buildTopic(1, "Без применения инструментов", "Без инструментов",
                        "https://ru.wikipedia.org/wiki/%D0%A1%D1%82%D0%B0%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B8%D0%B9_%D0%B0%D0%BD%D0%B0%D0%BB%D0%B8%D0%B7_%D0%BA%D0%BE%D0%B4%D0%B0"),
                buildTopic(2, "Сканирование заимствованных компоненов", "Без инструментов",
                        "https://ru.wikipedia.org/wiki/%D0%A1%D1%82%D0%B0%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B8%D0%B9_%D0%B0%D0%BD%D0%B0%D0%BB%D0%B8%D0%B7_%D0%BA%D0%BE%D0%B4%D0%B0"),
                buildTopic(3, "Unit-тестирование", "Без инструментов",
                        "https://ru.wikipedia.org/wiki/%D0%A1%D1%82%D0%B0%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B8%D0%B9_%D0%B0%D0%BD%D0%B0%D0%BB%D0%B8%D0%B7_%D0%BA%D0%BE%D0%B4%D0%B0"),
                buildTopic(4, "Статический анализ", "Стати́ческий ана́лиз ко́да (англ. static code analysis) — анализ программного обеспечения, " +
                                "производимый (в отличие от динамического анализа) без реального выполнения исследуемых программ. В большинстве случаев анализ " +
                                "производится над какой-либо версией исходного кода, хотя иногда анализу подвергается какой-нибудь вид объектного кода, например " +
                                "P-код или код на MSIL. Термин обычно применяют к анализу, производимому специальным программным обеспечением (ПО), тогда как ручной " +
                                "анализ называют «program understanding», «program comprehension» (пониманием или постижением программы).",
                        "https://ru.wikipedia.org/wiki/%D0%A1%D1%82%D0%B0%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B8%D0%B9_%D0%B0%D0%BD%D0%B0%D0%BB%D0%B8%D0%B7_%D0%BA%D0%BE%D0%B4%D0%B0"),
                buildTopic(5, "Фаззинг-тестирование", "Фа́ззинг (англ. fuzzing) — техника тестирования программного обеспечения, часто автоматическая " +
                                "или полуавтоматическая, заключающаяся в передаче приложению на вход неправильных, неожиданных или случайных данных. Предметом " +
                                "интереса являются падения и зависания, нарушения внутренней логики и проверок в коде приложения, утечки памяти, вызванные такими " +
                                "данными на входе. Фаззинг является разновидностью выборочного тестирования (англ. random testing), часто используемого для проверки " +
                                "проблем безопасности в программном обеспечении и компьютерных системах.",
                        "https://ru.wikipedia.org/wiki/%D0%A1%D1%82%D0%B0%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B8%D0%B9_%D0%B0%D0%BD%D0%B0%D0%BB%D0%B8%D0%B7_%D0%BA%D0%BE%D0%B4%D0%B0"),
                buildTopic(6, "Проверка корректности проведания анализа", "Важно не только проводить исследования, но также быть уверенным, что проведённые " +
                                "испытания дают корректный результат",
                        "https://ru.wikipedia.org/wiki/%D0%A1%D1%82%D0%B0%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B8%D0%B9_%D0%B0%D0%BD%D0%B0%D0%BB%D0%B8%D0%B7_%D0%BA%D0%BE%D0%B4%D0%B0")
        );
    }

    private Topic buildTopic(Integer id, String name, String description, String link) {
        return Topic.builder()
                .id(id)
                .name(name)
                .description(description)
                .link(link)
                .build();
    }
}
