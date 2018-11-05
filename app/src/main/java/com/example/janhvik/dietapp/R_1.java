package com.example.janhvik.dietapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class R_1 extends AppCompatActivity {

    Toolbar mtool;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_1);
        mtool = (Toolbar)findViewById(R.id.tbr1);
        res = (TextView)findViewById(R.id.tv);
        loadText();
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            mtool.setTitle(bundle.getString("RecipeName"));
            if(mtool.getTitle().toString().equalsIgnoreCase("Provencal Omelet")){
                String rec1=
                        "Ingredients\n" +
                        "•\t Nonstick cooking spray\n" +
                        "\n" +
                        "•\t 2 cups sliced fresh mushrooms\n" +
                        "\n" +
                        "•\t 3 tablespoons sliced green onion\n" +
                        "\n" +
                        "•\t 1 clove garlic, minced\n" +
                        "\n" +
                        "•\t 1 cup refrigerated or frozen egg product, thawed, or 4 eggs\n" +
                        "\n" +
                        "•\t 1/4 teaspoon herbes de Provence or dried thyme or basil, crushed\n" +
                        "\n" +
                        "•\t 1/8 teaspoon salt\n" +
                        "\n" +
                        "•\t Dash ground black pepper\n" +
                        "\n" +
                        "•\t 1 teaspoon olive oil\n" +
                        "\n" +
                        "•\t 1/4 cup shredded part-skim mozzarella cheese (1 ounce)\n" +
                        "\n" +
                        "•\t 1 tablespoon finely shredded Asiago or Parmesan cheese\n" +
                        "\n" +
                        "•\t 1 medium plum tomato, chopped\n" +
                        "\n" +
                        "•\t Snipped fresh parsley (optional)\n" +
                        "\n" +
                        "Directions\n" +
                        "1.\t Lightly coat an unheated 6- to 7-inch nonstick skillet with flared sides with nonstick cooking spray. Preheat skillet over medium heat. Add mushrooms, green onion, and garlic to skillet; cook until tender; stirring frequently. Remove mushroom mixture from skillet using a slotted spoon; set aside. If necessary, pour liquid out of skillet; carefully wipe out skillet.\n" +
                        "2.\t In a medium bowl, combine egg product or eggs, herbes de Provence, salt, and pepper. Beat with a whisk or rotary beater until combined. Add 1/2 teaspoon of the oil to clean skillet. Preheat skillet over medium heat.\n" +
                        "3.\t Pour half of the egg mixture into prepared skillet. Cook, without stirring, about 1 minute or until egg mixture begins to set. Run a spatula around edge of skillet, lifting egg mixture so uncooked portion flows underneath.\n" +
                        "4.\t Continue cooking and lifting edges until egg mixture is set but is still glossy and moist. Sprinkle with half of the mozzarella cheese. Top with half of the mushroom mixture. Continue cooking until cheese just begins to melt. Using the spatula, lift and fold an edge of the omelet partially over filling. Transfer omelet to a warm plate. Prepare another omelet with remaining oil, egg mixture, mozzarella, and mushroom mixture. Top omelets with Asiago or Parmesan cheese, tomato, and, if desired, parsley. Makes 2 omelets.\n";
                res.setText(rec1);
            }
            else if(mtool.getTitle().toString().equalsIgnoreCase("Herb-Bran Muffins")){
                String rec1=
                        "Ingredients\n" +
                        "•\t Nonstick cooking spray\n" +
                        "\n" +
                        "•\t 1 1/2 cups all-purpose flour\n" +
                        "\n" +
                        "•\t 1 cup whole bran cereal\n" +
                        "\n" +
                        "•\t 2 tablespoons grated Parmesan cheese\n" +
                        "\n" +
                        "•\t 1 tablespoon sugar\n" +
                        "\n" +
                        "•\t 1/2 teaspoon baking powder\n" +
                        "\n" +
                        "•\t 1/4 teaspoon baking soda\n" +
                        "\n" +
                        "•\t 2 teaspoons snipped fresh basil, dill, rosemary, thyme, sage, or chives\n" +
                        "\n" +
                        "•\t 2 beaten egg whites or 1 beaten egg\n" +
                        "\n" +
                        "•\t 1 cup buttermilk\n" +
                        "\n" +
                        "•\t 1/4 cup cooking oil\n" +
                        "\n" +
                        "Directions\n" +
                        "1.\t Line muffin pan with paper liners or lightly coat ten to twelve 2-1/2-inch muffin cups with nonstick cooking spray; set aside. In a large bowl stir together the flour, cereal, Parmesan cheese, sugar, baking powder, baking soda, and desired herb. Make a well in the center of the flour mixture.\n" +
                        "2.\t In a small bowl combine egg whites or egg, buttermilk, and cooking oil. Add all at once to flour mixture. Stir just until moistened (batter will be lumpy).\n" +
                        "3.\t Spoon batter into muffin cups; set aside. Bake in a 400 degree oven about 20 minutes or until golden. Cool on a wire rack about 5 minutes. Remove muffins from pan; serve warm. Makes 10 to 12 muffins.\n";
                res.setText(rec1);
            }
            else if(mtool.getTitle().toString().equalsIgnoreCase("Scrambled Eggs with Tomatoes and Peppers")){
                String rec1="Ingredients\n" +
                        "•\t 1 tablespoon olive oil\n" +
                        "\n" +
                        "•\t 1/2 cup chopped onion\n" +
                        "\n" +
                        "•\t 1/2 cup chopped red or green sweet pepper\n" +
                        "\n" +
                        "•\t 1/2 cup chopped, seeded tomato\n" +
                        "\n" +
                        "•\t 2 cups refrigerated or frozen egg product, thawed, or 8 eggs\n" +
                        "\n" +
                        "•\t 1/3 cup fat-free milk\n" +
                        "\n" +
                        "•\t 1/4 teaspoon salt\n" +
                        "\n" +
                        "•\t 1/8 teaspoon ground black pepper\n" +
                        "\n" +
                        "Directions\n" +
                        "1.\t In a large skillet, heat olive oil over medium heat. Add onion and sweet pepper; cook for 4 to 6 minutes or until tender, stirring occasionally. Stir in tomato.\n" +
                        "2.\t Meanwhile, in a medium bowl, beat together eggs, milk, salt, and black pepper. Add egg mixture to onion mixture in skillet. Cook over medium heat, without stirring, until mixture begins to set on the bottom and around edge.\n" +
                        "3.\t With a spatula or a large spoon, lift and fold the partially cooked egg mixture so that the uncooked portion flows underneath. Continue cooking over medium heat for 2 to 3 minutes or until egg mixture is cooked through but is still glossy and moist. Remove from heat. Serve immediately. Makes 4 servings.\n";
                res.setText(rec1);
            }
            else if(mtool.getTitle().toString().equalsIgnoreCase("Muesli")){
                String rec1="Benefits:\n" +
                        "•\tOne of the chief ingredients of Muesli is Oats which are packed with a special fiber known as beta-glucan. Beta-glucan is important to our health for a variety of reasons including a reduction in cholesterol levels and stabilizing blood sugar levels. Take a look at this article to know more about benefits (backed by studies) of oats and beta-glucan – The ABC’s Of Oats: Nutrition Facts, Benefits & Indian Style Oats Recipes.\n" +
                        "Ingredients You Will Need:\n" +
                        "•\tRolled Oats – 120 grams\n" +
                        "•\tLow-fat Milk – 300 ml\n" +
                        "•\tChopped Walnuts – 10 grams\n" +
                        "•\tChopped Almonds – 10 grams\n" +
                        "•\tRaisins – 20 grams\n" +
                        "•\tChopped apple – 40 grams\n" +
                        "•\tChopped banana – 40 grams\n" +
                        "•\tVanilla essence – 5 grams\n" +
                        "•\tSugar – 2-3 tablespoon\n" +
                        "How To Prepare Muesli:\n" +
                        "•\tBegin by mixing the oats, chopped almonds and walnuts in a container.\n" +
                        "•\tTransfer the contents to a non-stick pan and lightly roast it for 3-5 minutes. Don’t forget to stir the mixture continuously.\n" +
                        "•\tEmpty the content in an airtight container. Allow it to cool for a while and add raisins and vanilla essence to it. Mix well.\n" +
                        "•\tThen take a serving bowl and transfer the previously prepared muesli mixture along with chopped bananas and apples. You can also add sugar for taste.\n" +
                        "•\tNow add milk to it and stir properly. Your breakfast is ready!\n" +
                        "Nutrition Profile of Muesli\n" +
                        "Calories\t270\n" +
                        "Protein\t12 grams\n" +
                        "Carbs\t40 grams\n" +
                        "Fat\t5 grams\n";
                res.setText(rec1);
            }
            else if(mtool.getTitle().toString().equalsIgnoreCase("Mixed Sprouts Poha")){
                String rec1="Benefits:\n" +
                        "•\tWell, if you have been following a strict vegetarian diet for some time then there’s no way you don’t know about the benefits of Sprouts. Sprouts are not only good for our digestive health, but they are also equally important for maintaining healthy skin. Moreover, it may regulate blood sugar levels by increasing the activity of hydrolytic enzymes.\n" +
                        "•\tPoha or beaten rice is well off with carbs which mean you are less likely to feel lethargic during the day hours. Apart from carbs, Poha is also rich in Iron and fiber content.\n" +
                        "Ingredients You Will Need:\n" +
                        "•\tPoha – 200 grams\n" +
                        "•\tMixed Sprouts – 1oo grams\n" +
                        "•\tChopped onions – 20 grams\n" +
                        "•\tChopped green chilies – 20 grams\n" +
                        "•\tMustard seeds – 1 tablespoon\n" +
                        "•\tTurmeric powder – 1 tablespoon\n" +
                        "•\tCoriander leaves – 1 tablespoon\n" +
                        "•\tLemon juice – 1 tablespoon\n" +
                        "•\tSugar – ½ tablespoon\n" +
                        "•\tOil – 1 tablespoon\n" +
                        "•\tSalt – As per taste\n" +
                        "How To Prepare Mixed Sprouts Poha:\n" +
                        "•\tPlace poha/beaten rice in a sieve and wash it lightly. Drain the water and keep it aside for 10 minutes.\n" +
                        "•\tTake a non-stick pan and heat oil on a medium flame. Add mustard seeds, chopped onions and green chilies. Sauté till onions turn light brown.\n" +
                        "•\tThen add mixed sprouts and sauté for another couple of minutes on a medium flame.\n" +
                        "•\tAdd salt and sugar to the sauté and cook for another couple of minutes.\n" +
                        "•\tNow add poha and a tablespoon of lemon juice and mix well. Cook it for 2-3 minutes while stirring it continuously to avoid overcooking.\n" +
                        "•\tGarnish with coriander leaves. Serve hot with tea or coffee.\n" +
                        "Nutrition Profile of Mixed Sprouts Poha\n" +
                        "Calories\t280\n" +
                        "Protein\t20 grams\n" +
                        "Carbs\t60 grams\n" +
                        "Fat\t4 grams\n";
                res.setText(rec1);
            }
            else if(mtool.getTitle().toString().equalsIgnoreCase("Paneer Paratha")) {
                String rec1 = "Benefits:\n" +
                        "•\tPaneer paratha is one of the finest breakfast choices for indian people on weight loss as it is very low in cholesterol and sugar level. Besides protein and calcium, paneer is an excellent source of conjugated linoleic acid – a fatty acid which aids fat burning process and thereby helps in losing weight.\n" +
                        "However, you should think twice before making it a daily breakfast choice due to its high saturated fat content.\n" +
                        "Ingredients You Will Need:\n" +
                        "•\tFinely chopped Dill leaves – 30 grams\n" +
                        "•\tFinely chopped mint leaves – 30 grams\n" +
                        "•\tFinely chopped coriander – 30 grams\n" +
                        "•\tFinley chopped green chilies – 10 grams\n" +
                        "•\tGrated cottage cheese – 50 grams\n\n" +
                        "Note – Mix the ingredients mentioned above to prepare herb stuffing.\n\n" +
                        "•\tSemi-cooked whole wheat chapatis – 4 chapatis\n" +
                        "•\tCooking Oil – 2 tablespoon\n" +
                        "How To Prepare Herbed Paneer Paratha:\n" +
                        "•\tStart by making herb stuffing using the ingredients listed above. Divide the stuffing in desired no. of portions depending upon how many parathas you are willing to make.\n" +
                        "•\tTake one semi-cooked chapati and spread one portion of the herb stuffing on half part of the chapati. Roll the other half over it to make it look like a semi-circle.\n" +
                        "•\tTake a medium-size nonstick pan and pour a tablespoon of oil in it. At medium flame, cook paratha for 2-3 minutes or until it turns brown on both the halves.\n" +
                        "•\tServe hot with curd.\n";
                res.setText(rec1);
            }
            else if(mtool.getTitle().toString().equalsIgnoreCase("Oats Mutter Dosa")) {
                String rec1 = "Benefits:\n" +
                        "•\tOats mutter dosa makes your breakfast tasty besides healthy. All hail beta-glucan, the special fiber you get from oat bran. Moreover, the addition of boiled peas, split lentils and carrots enhance it nutritional values.\n" +
                        "Ingredients You Will Need:\n" +
                        "•\tCooking Oil – 1-2 tablespoon\n" +
                        "•\tMustard seeds – ½ tablespoon\n" +
                        "•\tSlit green chilies – 2\n" +
                        "•\tFinely chopped onions – 30 grams\n" +
                        "•\tGrated carrots – 30 grams\n" +
                        "•\tBoiled green peas – 20 grams\n" +
                        "•\tChat Masala – ½ tablespoon\n" +
                        "•\tChilli Powder – 1 tablespoon\n" +
                        "•\tLemon Juice – 1 tablespoon\n" +
                        "•\tSalt – As per taste\n" +
                        "Note – Mix the above-mentioned ingredients to prepare the stuffing.\n" +
                        "•\tRolled Oats – 200 grams\n" +
                        "•\tUrad Dal (split black lentils) – 40 grams\n" +
                        "•\tCooking oil – 2-3 tablespoon\n\n" +
                        "How To Prepare Oats Mutter Dosa:\n\n" +
                        "Preparing dosa batter –\n" +
                        "Mix the oats, urad dal and a pinch of salt in a container. Then transfer the contents to a mixture to blend it into a fine powder.\n" +
                        "Add at least 1-2 cups of water and stir thoroughly to make the batter of pouring consistency. Cover the batter with a lid and keep it aside for 15 minutes.\n" +
                        "Preparing the stuffing –\n" +
                        "Take a large size non-stick pan and pour a 1-2 tablespoon of cooking oil in it. Turn the stove on medium flame and add mustard seeds and green chili.\n" +
                        "Add chopped onions and sauté on a medium flame for 2 minutes or until onions turn brown.\n" +
                        "Then add grated carrots and green peas. Mix well and cook for 2 minutes.\n" +
                        "Now add chaat masala and chili powder. Mix well and cook for 1-2 minute.\n" +
                        "Finally, add lemon juice to the pan and mix well. Turn off the stove. Mutter dosa stuffing is now ready.\n" +
                        "Preparing the Dosa –\n" +
                        "•\tGrease a non-stick pan using cooking oil.\n" +
                        "•\tPour a small amount of batter into the pan and spread it to make a round dosa. Make sure that edges are not very thick.\n" +
                        "•\tAllow it to cook on a medium flame till the color of dosa appears light brown.\n" +
                        "•\tThen take a portion of stuffing and spread it on the center of the dosa. Roll the edges over. You can use remaining batter to make more dosa.\n" +
                        "•\tServe hot with sambhar or chutney.\n";
                res.setText(rec1);
            }
            else if(mtool.getTitle().toString().equalsIgnoreCase("Banana Apple Porridge")) {
                String rec1 = "Benefits:\n" +
                        "•\tApart from being the easiest breakfast option on this list, Banana apple porridge is also loaded with fiber and vitamins.\n" +
                        "•\tBesides small amounts of Vitamin A, B, and E, bananas are very rich in potassium (over 400mg in a medium size banana). Potassium keeps our bones healthy and aids healthy blood pressure. Similarly, apples are well off with Vitamin A, C, and Soluble fiber. Take a look at this article to know how an apple a day keeps muscle losses away.\n" +
                        "\n"+"Ingredients You Will Need:\n\n" +
                        "•\tBroken Wheat (Dalia) – 30 grams\n" +
                        "•\tRolled oats – 20 grams\n" +
                        "•\tChopped apples – 40 grams\n" +
                        "•\tChopped bananas – 40 grams\n" +
                        "•\tLow-fat milk – 250 ml\n" +
                        "•\tLow-fat butter – 1 tablespoon\n" +
                        "•\tCinnamon powder – ½ tablespoon\n" +
                        "•\tPowdered sugar – As per taste\n\n" +
                        "How To Prepare Banana Apple Porridge:\n\n" +
                        "•\tBegin with lightly washing the broken wheat and draining the remaining water.\n" +
                        "•\tOn a medium flame, heat butter in a pressure cooker along with broken wheat for about 3-5 minutes.\n" +
                        "•\tThen oats to the cooker and sauté for another couple of minutes.\n" +
                        "•\tAdd milk and a cup of half of water to the pressure cooker and cook for two whistles.\n" +
                        "•\tLet the steam escape before you take off the lid.\n" +
                        "•\tLastly, add sugar and cinnamon powder and stir thoroughly.\n" +
                        "•\tRefrigerate it for a while.\n" +
                        "•\tAdd chopped apples and bananas to it and serve.\n";
                res.setText(rec1);
            }
            else if(mtool.getTitle().toString().equalsIgnoreCase("Chana Dal Pancakes")) {
                String rec1 = "Benefits:\n" +
                        "•\tDue to its low glycemic index and its ability to utilize blood sugar effectively, Chana Dal pancake is a good choice for an early morning breakfast. You can also add vegetables to increase its nutrient content. Besides being healthy, Chana Dal can be used in many ways like roasting and powdering to make sattu or grind to make besan and all that with taste and keeping health a priority.\n" +
                        "\nIngredients You Will Need:\n\n" +
                        "•\tChana Dal (Split Bengal Gram) soaked and drained– 100 grams\n" +
                        "•\tChopped Fenugreek – 100 grams\n" +
                        "•\tChopped Spinach – 100 grams\n" +
                        "•\tGrated Carrots – 50 grams\n" +
                        "•\tGrated Ginger – 5 grams\n" +
                        "•\tCurd – 10 grams\n" +
                        "•\tChopped green chilies – 2\n" +
                        "•\tCurry leaves – 5 twigs\n" +
                        "•\tCooking Oil – 1-2 tablespoon\n" +
                        "•\tSalt – As per taste\n\n" +
                        "How To Prepare Chana Dal Pancakes:\n\n" +
                        "•\tYou will have to first grind the soaked Chana dal to make a coarse paste.\n" +
                        "•\tNow add green chilies, grated ginger, carrots, spinach and fenugreek leaves along with a pinch of salt to the paste and mix thoroughly.\n" +
                        "•\tDivide the paste into desired no. of portions depending upon no. of pancakes, you are willing to make.\n" +
                        "•\tTake a non-stick pan and pour a tablespoon of cooking oil in it. Then add one portion of the paste and allow it to cook on a slow flame.\n" +
                        "•\tFlip the pancake once the base is firmly cooked.\n" +
                        "•\tServe hot with pickle or curd.\n";
                res.setText(rec1);
            }
            }
        }
    private void loadText(){
        res.setMovementMethod(new ScrollingMovementMethod());
    }
}
