package com.github.panarik.qa_trainer.ui.trainer.model

import com.github.panarik.qa_trainer.R

object Trainers {

    val data = listOf(
        TrainerScheme(
            "TMS TestRail (управление проектом)",
            R.drawable.home_item_tms_image,
            R.drawable.trainer_item_testrail_logo,
            listOf(
                TrainerTopic(
                    "Для чего нужен Advanced level", "",
                    listOf(
                        TrainerItemTitle("Для чего нужен Advanced level"),
                        TrainerItemImage(R.drawable.trainer_tms_0_default_scheme),
                        TrainerItemTextBlock(
                            "" +
                                    "Изначально после установки TestRail содержит некий демо шаблон для новых проектов. " +
                                    "На нем уже заранее настроены основные поля для тект-кейсов. " +
                                    "Очень часто в компаниях и пользуются только демо шаблоном. " +
                                    "Это связано с тем, что QA не знают как кастомизировать и организовать TestRail под задачи проекта, а Девопсы не знают что нужно QA. " +
                                    "Данный тренер поможет Вам организовать и кастомизировать TestRail под определенный проект. " +
                                    "Вы сможете более гибко проводить тест-раны, экономить ресурсы и показать лучший перформанс при использовании TestRail. " +
                                    "В общем - управляем систем, а не просто пользуемся дефолтным функционалом." +
                                    "Я бы сказал что это является большим преимуществом для QA специалиста уровня мидл+ и QA лида."
                        )
                    )
                ),
                TrainerTopic(
                    "План упражнений", "",
                    listOf(TrainerItemTitle(""))
                ),
                TrainerTopic(
                    "Создаём свой TestRail", "",
                    listOf(
                        TrainerItemTitle("Создаём свой TestRail"),
                        TrainerItemTextBlock(
                            "" +
                                    "Заходим на testrail.com и регистрируем новый проект. " +
                                    "Почту можно использовать любую к которой есть доступ."
                        ),
                        TrainerItemImage(R.drawable.trainer_tms_1_create_account),
                        TrainerItemTextBlock(
                            "" +
                                    "Подтверждаем почту."
                        ),
                        TrainerItemImage(R.drawable.trainer_tms_2_confirm_mail),
                        TrainerItemTextBlock(
                            "" +
                                    "TestRail зарегистрирован. Начинаем создаем новый проект."
                        ),
                        TrainerItemImage(R.drawable.trainer_tms_3_add_project),
                        TrainerItemTextBlock(
                            "" +
                                    "Используем схему по умолчанию."
                        ),
                        TrainerItemImage(R.drawable.trainer_tms_4_use_default_scheme),

                    ),

                    ),
                TrainerTopic(
                    "", "",
                    listOf(TrainerItemTitle(""))
                ),
            )
        )
    )

}