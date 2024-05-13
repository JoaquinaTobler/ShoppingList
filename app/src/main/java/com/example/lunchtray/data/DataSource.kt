/*
 * Copyright (C) 2021 The Android Open Source Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.lunchtray.data

import com.example.lunchtray.constants.ItemType
import com.example.lunchtray.model.MenuItem

/**
 * Map of available menu items to be displayed in the menu fragments.
 */
object DataSource {
    val menuItems = mapOf(
        "Milanese chicken with rice" to
                MenuItem(
                    name = "Milanese Chicken with Rice",
                    description = "\n" +
                            "-Milanese chicken\n" +
                            "-Rice\n" +
                            "-Butter\n" +
                            "-Grated cheese",
                    type = ItemType.MENULUNCH
                ),
        "Milanese chicken with fries" to
                MenuItem(
                    name = "Milanese Chicken with Fries",
                    description = "\n" +
                            "-Milanese chicken\n" +
                            "-Potatoes\n" +
                            "-Potatoes\n" +
                            "-Oil",
                    type = ItemType.MENULUNCH
                ),
        "Milanese chicken with puree" to
                MenuItem(
                    name =
                    "Milanese Chicken with Puree",
                    description = "\n" +
                            "-Milanese chicken \n" +
                            "-Potato \n" +
                            "-Milk \n" +
                            "-Butter",
                    type = ItemType.MENULUNCH
                ),
        "Milanese meat with rice" to
                MenuItem(
                    name = "Milanese Meat with Rice",
                    description = "\n" +
                            "-Milanese meat\n" +
                            "-Rice\n"+
                            "-Butter\n"+
                            "-Grated cheese",
                    type = ItemType.MENULUNCH
                ),
        "Milanese meat with fries" to
                MenuItem(
                    name = "Milanese Meat with Fries",
                    description = "\n" +
                            "-Milanese meat\n" +
                            "-Potatoes\n"+
                            "-Oil",
                    type = ItemType.MENULUNCH
                ),
        "Milanese meat with puree" to
                MenuItem(
                    name = "Milanese Meat with Puree",
                    description = "\n" +
                            "-Milanese meat\n" +
                            "-Potatoes\n"+
                            "-Milk\n"+
                            "-Butter",
                    type = ItemType.MENULUNCH
                ),
        "Ham and cheese tart with salad" to
                MenuItem(
                    name = "Ham and Cheese Tart with Salad",
                    description = "\n" +
                            "-Ham\n" +
                            "-Mozzarella\n"+
                            "-Pie crust\n"+
                            "-Carrot\n"+
                            "-Eggs",
                    type = ItemType.MENULUNCH
                ),
        "Entrana with rice" to
                MenuItem(
                    name = "Entrana with Rice",
                    description = "\n" +
                            "-Entraña\n" +
                            "-Butter\n"+
                            "-Rice",
                    type = ItemType.MENULUNCH
                ),
        "Entrana with puree" to
                MenuItem(
                    name = "Entrana with Puree",
                    description = "\n" +
                            "-Entraña\n" +
                            "-Potatoes\n"+
                            "-Milk\n"+
                            "-Butter",
                    type = ItemType.MENULUNCH
                ),
        "Entrana with fries" to
                MenuItem(
                    name = "Entrana with Fries",
                    description = "\n" +
                            "-Entrana\n" +
                            "-Potatoes\n"+
                            "-Oil",
                    type = ItemType.MENULUNCH
                ),
        "Steaks with puree" to
                MenuItem(
                    name = "Steaks with Puree",
                    description = "\n" +
                            "-Steaks\n" +
                            "-Potatoes\n"+
                            "-Oil",
                    type = ItemType.MENULUNCH
                ),
        "Steaks with fries" to
                MenuItem(
                    name = "Steaks with Fries",
                    description = "\n" +
                            "-Steaks\n" +
                            "-Potatoes\n"+
                            "-Oil",
                    type = ItemType.MENULUNCH
                ),
        "Steaks with rice" to
                MenuItem(
                    name = "Steaks with Rice",
                    description = "\n" +
                            "-Steaks\n" +
                            "-Rice\n"+
                            "-Butter",
                    type = ItemType.MENULUNCH
                ),
        "Hamburger with bread" to
                MenuItem(
                    name = "Hamburger with Bread",
                    description = "\n" +
                            "-Minced meat\n" +
                            "-Bun for hamburger\n"+
                            "-Lettuce\n"+
                            "-Mayonnaise\n"+
                            "-Eggs\n"+
                            "-Tomatoes",
                    type = ItemType.MENULUNCH
                ),
        "Hamburger with fries" to
                MenuItem(
                    name = "Hamburger with Fries",
                    description = "\n" +
                            "-Mince meat\n" +
                            "-Potatoes\n"+
                            "-Oil",
                    type = ItemType.MENULUNCH
                ),
        "Hamburger with puree" to
                MenuItem(
                    name = "Hamburger with Puree",
                    description = "\n" +
                            "-Mince meat\n" +
                            "-Potatoes\n"+
                            "-Milk\n"+
                            "-Butter",
                    type = ItemType.MENULUNCH
                ),
        "Semolina gnocchi with salad" to
                MenuItem(
                    name = "Semolina Gnocchi with Salad",
                    description = "\n" +
                            "-Semolina\n" +
                            "-Milk\n"+
                            "-Butter\n"+
                            "-Cream\n"+
                            "-Carrot\n"+
                            "-Lettuce"+
                            "-Tomatoes",
                    type = ItemType.MENULUNCH
                ),
        "Sausages with rice" to
                MenuItem(
                    name = "Sausages with Rice",
                    description = "\n" +
                            "-Sausages\n" +
                            "-Rice\n"+
                            "-Butter\n"+
                            "-Dressings",
                    type = ItemType.MENULUNCH
                ),
        "meat bread with salad" to
                MenuItem(
                    name = "Meat Bread with Salad",
                    description = "\n" +
                            "-Mince meat\n" +
                            "-Spinach\n"+
                            "-Mozzarella",
                    type = ItemType.MENULUNCH
                ),
        "omelet" to
                MenuItem(
                    name = "Omelet",
                    description = "\n" +
                            "-Eggs\n" +
                            "-Ham\n"+
                            "-Cheese\n"+
                            "-Parsley",
                    type = ItemType.MENULUNCH
                ),
        "salad" to
                MenuItem(
                    name = "Salad",
                    description = "\n" +
                            "-Rice\n" +
                            "-Cherry tomatoes\n"+
                            "-Cheese\n"+
                            "-Mayonnaise",
                    type = ItemType.MENULUNCH
                ),
        "ravioli with sauce" to
                MenuItem(
                    name = "Ravioli with Sauce",
                    description = "\n" +
                            "-Vegetable ravioli\n" +
                            "-Tomato sauce\n"+
                            "-Garlic\n"+
                            "-Vegetable broth\n"+
                            "-Laurel\n"+
                            "-Cream",
                    type = ItemType.MENULUNCH
                ),
        "noodles with sauce" to
                MenuItem(
                    name = "Noodles with Sauce",
                    description = "\n" +
                            "-Noodles\n" +
                            "-Tomato sauce\n"+
                            "-Garlic\n"+
                            "-Vegetable broth\n"+
                            "-Laurel\n"+
                            "-Cream",
                    type = ItemType.MENULUNCH
                ),
        "chicken breast with rice" to
                MenuItem(
                    name = "Chicken Breast with Rice",
                    description = "\n" +
                            "-Chicken breast\n" +
                            "-Onion\n"+
                            "-Cream\n"+
                            "-Mustard\n"+
                            "-Rice\n"+
                            "-Butter",
                    type = ItemType.MENULUNCH
                ),
        "chicken breast with puree" to
                MenuItem(
                    name = "Chicken Breast with Puree",
                    description = "\n" +
                            "-Chicken breast\n" +
                            "-Onion\n"+
                            "-Cream\n"+
                            "-Mustard\n"+
                            "-Potatoes"+
                            "-Milk\n"+
                            "-Butter",
                    type = ItemType.MENULUNCH
                ),
        "chicken breast with salad" to
                MenuItem(
                    name = "Chicken Breast with Salad",
                    description = "\n" +
                            "-Chicken breast\n" +
                            "-Onion\n"+
                            "-Cream\n"+
                            "-Mustard\n"+
                            "-Carrot\n"+
                            "-Tomatoes\n"+
                            "-Lettuce",
                    type = ItemType.MENULUNCH
                ),
        "pascualina" to
                MenuItem(
                    name = "Pascualina",
                    description = "\n" +
                            "-Pie crust\n" +
                            "-Onion\n"+
                            "-Moroon\n"+
                            "-Chard\n"+
                            "-Bread crumbs\n"+
                            "-Mill\n"+
                            "-Eggs",
                    type = ItemType.MENULUNCH
                ),
        "pizza with faina" to
                MenuItem(
                    name = "Pizza with Faina",
                    description = "\n" +
                            "-Flour\n"+
                            "-Yeast\n"+
                            "-Mozzarella\n"+
                            "-Olive\n"+
                            "-Oregano\n"+ " +" +
                            "-Oil\n"+
                            "-Chickpea flour",
                    type = ItemType.MENULUNCH
                ),
        "potato gnocchi with sauce" to
                MenuItem(
                    name = "Potato Gnocchi with sauce",
                    description = "\n" +
                            "-Potatoes\n" +
                            "-Butter\n"+
                            "-Greates cheese\n"+
                            "-Self raising flour\n"+
                            "-Tomato puree\n"+
                            "-Garlic\n"+
                            "-Vegetable broth\n"+
                            "-Laurel",
                    type = ItemType.MENULUNCH
                ),
        "green noodles with sauce" to
                MenuItem(
                    name = "Green Noodles with Sauce",
                    description = "\n" +
                            "-Green noodles\n" +
                            "-Tomato sauce\n"+
                            "-Garlic\n"+
                            "-Vegetable broth\n"+
                            "-Laurel",
                    type = ItemType.MENULUNCH
                ),
        "chilean caya" to
                MenuItem(
                    name = "Chilean Caya",
                    description = "\n" +
                            "-Onion\n" +
                            "-Moroon\n"+
                            "-Mushrooms\n"+
                            "-Ham\n"+
                            "-Cream\n"+
                            "-Chicken\n"+
                            "-Vegetable broth\n"+
                            "-Saffron\n"+
                            "-Rice\n"+
                            "-Lettuce",
                    type = ItemType.MENULUNCH
                ),
        "chicken wok" to
                MenuItem(
                    name = "Chicken Wok",
                    description = "\n" +
                            "-Chicken\n" +
                            "-Moroon\n"+
                            "-Onion\n"+
                            "-Rice\n"+
                            "-Zucchini\n"+
                            "-Soy sauce",
                    type = ItemType.MENULUNCH
                ),
        "chorizo, blood sausage and sausage with puree" to
                MenuItem(
                    name = "Chorizo, Blood sausage and Sausage with Puree",
                    description = "\n" +
                            "-Chorizo\n" +
                            "-Blood sausage\n"+
                            "-Sausages\n"+
                            "-Potatoes\n"+
                            "-Milk",
                    type = ItemType.MENULUNCH
                ),
        "chorizo, blood sausage and sausage with rice" to
                MenuItem(
                    name = "Chorizo, Blood sausage and Sausage with Rice",
                    description = "\n" +
                            "-Chorizo\n" +
                            "-Blood sausage\n"+
                            "-Sausages\n"+
                            "-Rice\n"+
                            "-Butter",
                    type = ItemType.MENULUNCH
                ),
        "chorizo, blood sausage and sausage with fries" to
                MenuItem(
                    name = "Chorizo, Blood sausage and Sausage with Fries",
                    description = "\n" +
                            "-Chorizo\n" +
                            "-Blood sausage\n"+
                            "-Sausages\n"+
                            "-Potatoes\n"+
                            "-Oil",
                    type = ItemType.MENULUNCH
                ),
        "meatballs with rice" to
                MenuItem(
                    name = "Meatballs with Rice",
                    description = "\n" +
                            "-Mince meat\n" +
                            "-Casan cream\n"+
                            "-Tomato puree\n"+
                            "-Garlic\n"+
                            "-Laurel\n"+
                            "-Rice\n"+
                            "-Manteca\n"+
                            "-Bread crumbs",
                    type = ItemType.MENULUNCH
                ),
        "fritters" to
                MenuItem(
                    name = "Fritters",
                    description = "\n" +
                            "-Rice\n" +
                            "-Parsley\n"+
                            "-Self raising flour\n"+
                            "-Eggs\n"+
                            "-Oil",
                    type = ItemType.MENULUNCH
                ),
        "meat empanadas" to
                MenuItem(
                    name = "Meat empanadas",
                    description = "\n" +
                            "-Empanada dough\n" +
                            "-Mince meat\n"+
                            "-Onion\n"+
                            "-Green onion\n"+
                            "-Olive\n"+
                            "-Oil",
                    type = ItemType.MENULUNCH
                ),
        "garlic chicken" to
                MenuItem(
                    name = "Garlic Chicken",
                    description = "\n" +
                            "-Chicken\n" +
                            "-Garlic\n"+
                            "-Withe wine\n"+
                            "-Potatoes\n"+
                            "-Sweet paprika",
                    type = ItemType.MENULUNCH
                ),
        "meat fajitas" to
                MenuItem(
                    name = "Meat Fajitas",
                    description = "\n" +
                            "-Meat\n" +
                            "-Moroon\n"+
                            "-Onion\n"+
                            "-Soy sauce",
                    type = ItemType.MENULUNCH
                ),







        )
}
