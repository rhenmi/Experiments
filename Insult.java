import java.util.Random; 

class Insult {

public static void main(String args[]) {

String[] noun = {
"pilot",
"canoe",
"captain",
"pirate",
"hammer",
"knob",
"box",
"jockey",
"nazi",
"waffle",
"goblin",
"blossom",
"biscuit",
"clown",
"socket",
"monster",
"hound",
"dragon",
"balloon"};

String[] adj1 = {
"lazy",
"stupid",
"insecure",
"idiotic",
"slimy",
"slutty",
"smelly",
"pompus",
"communist",
"pie-eating",
"racist",
"elitist",
"white-trash",
"butterface",
"tone-deaf",
"ugly",
"creepy" };

String[] adj2 = {
"douche",
"ass",
"turd",
"rectum",
"butt",
"crotch",
"bitch",
"turd",
"nut" };

int random1, random2, random3;

Random randomGenerator = new Random();
/*
random1 = randomGenerator.nextInt(1000);
random2 = randomGenerator.nextInt(1000);
random3 = randomGenerator.nextInt(1000);

int length1 = adj1.length;
int length2 = adj2.length;
int length3 = noun.length;

int index1 = random1 % length1;
int index2 = random1 % length2;
int index3 = random1 % length3;
*/


int index1 = randomGenerator.nextInt(adj1.length);
int index2 = randomGenerator.nextInt(adj2.length);
int index3 = randomGenerator.nextInt(noun.length);

System.out.println ("You are a " + adj1[index1] + " " + adj2[index2] + " " + noun[index3] + "!");
}
}
