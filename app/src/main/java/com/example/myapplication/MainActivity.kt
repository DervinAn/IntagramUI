package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.Blueinsta
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                }
                InstaUi()
            }
        }
    }
}

@Composable
fun InstaUi(modifier: Modifier = Modifier) {
    
    Box(modifier = Modifier.fillMaxSize().padding(bottom = 40.dp, top = 25.dp)){
        Column(
            modifier = Modifier
                .fillMaxSize()

        ) {
            
            Row (
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                }
                Text(text = "vortexcraft.a", fontSize = 18.sp)
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = null)

                }
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Box(
                    modifier = Modifier
                        .size(96.dp)
                        .border(1.5.dp, Color(0xFFC7C7CC), RoundedCornerShape(250.dp))
                        .offset(x = 5.dp, y = 5.dp)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.vortexcraftprofile),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(86.dp)
                            .clip(RoundedCornerShape(250.dp))
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                TextmidSecetion(text = "Posts", number = 120)
                Spacer(modifier = Modifier.width(10.dp))
                TextmidSecetion(text = "Followers", number = 120)
                Spacer(modifier = Modifier.width(10.dp))
                TextmidSecetion(text = "Following", number = 120)
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 15.dp)
                    .padding(top = 5.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(text = "vortexcraft", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
                Text( text = "Digital creator", fontSize = 14.sp, color = Blueinsta, )
                Text(text = "Mobile App Development Agency")
                Text(text = "💼|Empowering E-commerce, Education , and Real Estate for Global success")
                Text(text = "📧|Contact us: vortexcraft.agency@gmail.com")

            }

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 7.dp)
                    .padding(horizontal = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ){

                Button(
                    onClick = { /*TODO*/ },  // Action to perform when the button is clicked
                    modifier = Modifier
                        .width(120.dp)  // Set button width
                        .height(33.dp),  // Set button height
                    shape = RoundedCornerShape(10.dp),  // Set the shape to remove rounded corners
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF3797EF),  // Background color of the button
                        contentColor = Color.White  // Text color within the button
                    )
                ) {
                    Text(text = "Follow")  // The text displayed on the button
                }


                Spacer(modifier = Modifier.width(5.dp))
                Button(onClick = { /*TODO*/ },modifier = Modifier
                    .width(120.dp)
                    .height(33.dp),
                    shape  = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF3797EF),  // Background color of the button
                        contentColor = Color.White  // Text color within the button
                    )) { Text(text = "Message") }
                Spacer(modifier = Modifier.width(5.dp))
                Button(onClick = { /*TODO*/ },modifier = Modifier
                    .width(120.dp)
                    .height(33.dp),
                    shape  = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF3797EF),  // Background color of the button
                        contentColor = Color.White  // Text color within the button
                    )) { Text(text = "Email") }

            }

            PostSection()


        }
        BottomNavigation(Modifier.align(Alignment.BottomCenter))
    }
    
}

@Composable
fun TextmidSecetion(text : String , number: Int) {

    Column (
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
//        verticalArrangement =
    ){

        Text(text = text, fontSize = 16.sp,)
        Text(text = number.toString(), fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
    }
    
}


@Composable
fun NavigationInInsta(modifier: Modifier = Modifier) {

    var index by remember {
        mutableStateOf("Home")
    }
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ){

        IconButton(onClick = { /*TODO*/
            index = "Home"
        }) {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = null,
                tint = if (index == "Home") Color.Black else Color.Gray
            )
        }

        IconButton(onClick = { /*TODO*/
            index = "Real's"
        }) {
            Icon(imageVector = Icons.Default.List, contentDescription = null,
                tint = if (index == "Real's") Color.Black else Color.Gray
            )
        }

        IconButton(onClick = {
            index = "Account"
        }) {
            Icon(
                imageVector = Icons.Default.AccountBox,
                contentDescription = null,
                tint = if (index == "Account") Color.Black else Color.Gray
            )
        }


    }
    
}


@Composable
fun PostSection(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 15.dp)
    ) {
        NavigationInInsta()
        PostsSection()
    }
}
@Composable
fun PostsSection(modifier: Modifier = Modifier) {

    val listOfPictures = listOf(
        R.drawable.p3,
        R.drawable.p2,
        R.drawable.p1,
    )
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 122.dp), // Adaptive grid with a minimum size
        modifier = modifier.fillMaxWidth()
    ) {
        items(listOfPictures.size) { index ->
            Box(modifier = Modifier.size(124.dp)){
                Image(
                    painter = painterResource(id = listOfPictures[index]),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}

@Composable
fun BottomNavigation(modifier: Modifier = Modifier) {


    var index by remember {
        mutableStateOf("Home")
    }
    Row (
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        IconButton(onClick = {
            index = "Home"
        }) {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = null,
                tint = if (index == "Home") Color.Black else Color.Gray,
                modifier = Modifier.size(34.dp)
            )
        }
        Spacer(modifier = Modifier.width(1.dp))
        IconButton(onClick = {
            index = "Search"
        }) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null,
                tint = if (index == "Search") Color.Black else Color.Gray,
                modifier = Modifier.size(34.dp)
            )
        }
        Spacer(modifier = Modifier.width(1.dp))
        IconButton(onClick = {
            index = "Add"
        }) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = null,
                tint = if (index == "Add") Color.Black else Color.Gray,
                modifier = Modifier.size(34.dp)
            )
        }
        Spacer(modifier = Modifier.width(1.dp))
        IconButton(onClick = {
            index = "Favorite"
        }) {
            Icon(
                imageVector = Icons.Default.FavoriteBorder,
                contentDescription = null,
                tint = if (index == "Favorite") Color.Black else Color.Gray,
                modifier = Modifier.size(34.dp)
            )
        }
        Spacer(modifier = Modifier.width(1.dp))
        IconButton(onClick = {
            index = "Account"
        }) {
            Icon(
                imageVector = Icons.Default.AccountBox,
                contentDescription = null,
                tint = if (index == "Account") Color.Black else Color.Gray,
                modifier = Modifier.size(34.dp)
            )
        }

    }

}














//@Composable
//fun InstaUi(modifier: Modifier = Modifier) {
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(top = 20.dp, bottom = 35.dp)
//    ) {
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(bottom = 56.dp) // Reserve space for BottomNavigation
//        ) {
//            Row (
//                modifier = Modifier
//                    .height(45.dp)
//                    .fillMaxWidth()
//                    .padding(horizontal = 15.dp),
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.End,
//            ) {
//                Text(
//                    text = "vortexcraft.a",
//                    fontSize = 16.sp,
//                    modifier = Modifier.padding(end = 120.dp)
//                )
//                Icon(
//                    imageVector = Icons.Default.Menu,
//                    contentDescription = null,
//                    modifier = Modifier
//                        .width(21.dp)
//                        .height(18.dp)
//                )
//            }
//
//            Row(
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.SpaceBetween,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(horizontal = 15.dp)
//            ) {
//                Box(modifier = Modifier
//                    .size(96.dp)
//                    .border(1.5.dp, Color(0xFFC7C7CC), RoundedCornerShape(250.dp))
//                    .offset(x = 5.dp, y = 5.dp)) {
//                    Image(
//                        painter = painterResource(id = R.drawable.vortexcraftprofile),
//                        contentDescription = null,
//                        contentScale = ContentScale.Crop,
//                        modifier = Modifier
//                            .size(86.dp)
//                            .clip(RoundedCornerShape(250.dp))
//                    )
//                }
//                FirstSection(number = 54, text = "Posts")
//                FirstSection(number = 8029, text = "Followers")
//                FirstSection(number = 100, text = "Following")
//            }
//
//            BoiSection(modifier.padding(horizontal = 16.dp))
//
//            Button(
//                onClick = { /*TODO*/ },
//                modifier = Modifier
//                    .align(alignment = Alignment.CenterHorizontally)
//                    .padding(top = 10.dp)
//                    .padding(horizontal = 15.dp)
//                    .fillMaxWidth(),
//                shape = RoundedCornerShape(6.dp),
//                colors = androidx.compose.material3.ButtonDefaults.buttonColors(
//                    containerColor = Color(0xFF0095F6),
//                    contentColor = Color.White
//                )
//            ) {
//                Text(text = "Edit Profile")
//            }
//
//            StorySection(modifier.padding(top = 15.dp))
//            PostSection()
//        }
//
//        // BottomNavigation appears at the bottom
//        BottomNavigation(
//            modifier = Modifier
//                .align(Alignment.BottomCenter)
//        )
//    }
//}
//
//
//@Composable
//fun FirstSection(number: Int, text: String) {
//
//    Column (
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ){
//
//        Text(text = number.toString(), fontSize = 16.sp, fontWeight = FontWeight.SemiBold, modifier =Modifier.padding(top=10.dp))
//        Text(text = text, fontSize = 13.sp , fontWeight = FontWeight.Medium)
//    }
//}
//
//@Composable
//fun BoiSection(modifier: Modifier = Modifier) {
//    Column(
//        modifier = modifier
//            .fillMaxWidth()
//            .padding(top = 14.dp),
//        horizontalAlignment = Alignment.Start
//    ) {
//        Text(text = "vortexcraft", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
//        Text(text = "Mobile App Development Agency\n" +
//                "\uD83D\uDCBC| Empowering E-commerce, Education, and Real Estate for global success.\n" +
//                "\uD83D\uDCE7| Contact us: vortexcraft.agency@gmail.com", fontSize = 16.sp)
//    }
//
//}
//
//@Composable
//fun StorySection(modifier: Modifier = Modifier) {
//    val stories = listOf(
//        Pair(R.drawable.ic_launcher_foreground, "New"),
//        Pair(R.drawable.story1, "Friends"),
//        Pair(R.drawable.story2, "Sport"),
//        Pair(R.drawable.story3, "Design"),
//        Pair(R.drawable.story4, "Result"),
//        Pair(R.drawable.story2, "Sport"),
//    )
//
//    LazyRow(
//        horizontalArrangement = Arrangement.spacedBy(20.dp),
//        modifier = modifier
//            .fillMaxWidth()
//            .padding(horizontal = 15.dp)
//    ) {
//        items(stories.size) { story ->
//            StoryItem(storyImage = stories[story].first, storyName = stories[story].second)
//        }
//    }
//}
//
//@Composable
//fun StoryItem(storyImage: Int, storyName: String) {
//    Column(
//        modifier = Modifier,
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Box(
//            modifier = Modifier
//                .border(1.dp, Color(0xFFC7C7CC), RoundedCornerShape(150.dp))
//                .size(64.dp)
//        ) {
//            Image(
//                painter = painterResource(id = storyImage),
//                contentDescription = null,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .size(64.dp)
//                    .clip(RoundedCornerShape(150.dp))
//            )
//        }
//        Text(text = storyName, fontSize = 16.sp)
//    }
//}
//
//@Composable
//fun PostSection(modifier: Modifier = Modifier) {
//    Column(
//        modifier = modifier
//            .fillMaxWidth()
//            .padding(top = 15.dp)
//            .border(BorderStroke(1.dp, Color.LightGray))
//    ) {
//    NavigationInPostSection()
//        PostsSection()
//    }
//}
//
//@Composable
//fun NavigationInPostSection() {
//
//    Row (
//        modifier = Modifier.fillMaxWidth(),
//        horizontalArrangement = Arrangement.SpaceEvenly,
//        verticalAlignment = Alignment.CenterVertically
//    ){
//
//        IconButton(onClick = { /*TODO*/ }) {
//             Icon(imageVector = Icons.Default.List, contentDescription = null, modifier = Modifier.size(34.dp))
//        }
//        Spacer(modifier = Modifier.width(1.dp))
//        IconButton(onClick = { /*TODO*/ }) {
//            Icon(imageVector = Icons.Default.AccountBox, contentDescription = null, modifier = Modifier.size(34.dp))
//        }
//
//    }
//
//}
//
//@Composable
//fun PostsSection(modifier: Modifier = Modifier) {
//
//    val listOfPictures = listOf(
//        R.drawable.story2,
//        R.drawable.story1,
//        R.drawable.story3,
//        R.drawable.story4,
//        R.drawable.story1,
//        R.drawable.story3,
//        R.drawable.story2,
//        R.drawable.story4,
//    )
//    LazyVerticalGrid(
//        columns = GridCells.Adaptive(minSize = 122.dp), // Adaptive grid with a minimum size
//        modifier = modifier.fillMaxWidth()
//    ) {
//        items(listOfPictures.size) { index ->
//            Box(modifier = Modifier.size(124.dp)) {
//                Image(
//                    painter = painterResource(id = listOfPictures[index]),
//                    contentDescription = null,
//                    contentScale = ContentScale.Crop,
//                    modifier = Modifier.fillMaxSize()
//                )
//            }
//        }
//    }
//}


//
//@Composable
//fun BottomNavigation(modifier: Modifier = Modifier) {
//
//    Row (
//        modifier = modifier.fillMaxWidth(),
//        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.SpaceEvenly
//    ){
//        IconButton(onClick = { /*TODO*/ }) {
//            Icon(imageVector = Icons.Default.Home, contentDescription = null, modifier = Modifier.size(34.dp))
//        }
//        Spacer(modifier = Modifier.width(1.dp))
//        IconButton(onClick = { /*TODO*/ }) {
//            Icon(imageVector = Icons.Default.Search, contentDescription = null, modifier = Modifier.size(34.dp))
//        }
//        Spacer(modifier = Modifier.width(1.dp))
//        IconButton(onClick = { /*TODO*/ }) {
//            Icon(imageVector = Icons.Default.Add, contentDescription = null, modifier = Modifier.size(34.dp))
//        }
//        Spacer(modifier = Modifier.width(1.dp))
//        IconButton(onClick = { /*TODO*/ }) {
//            Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = null, modifier = Modifier.size(34.dp))
//        }
//        Spacer(modifier = Modifier.width(1.dp))
//        IconButton(onClick = { /*TODO*/ }) {
//            Icon(imageVector = Icons.Default.AccountBox, contentDescription = null, modifier = Modifier.size(34.dp))
//        }
//
//    }
//
//}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        InstaUi()

    }
}