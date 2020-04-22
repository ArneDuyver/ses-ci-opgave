
[![travis build](https://travis-ci.org/github/ArneDuyver/ses-ci-opgave.svg?branch=master)](https://travis-ci.org/github/ArneDuyver/ses-ci-opgave)

1.1 De Calculator app
-----------------------
Ontwerp een command-line interface programma, getiteld ‘calculator’, 
dat twee argumenten inleest die terecht komen in de main() methode, en de sommatie ervan afdrukt:

Me@PC-ALPHA MINGW64 /c/git/UHasselt/Ses/ses-ci-opgave/src/main/java (master)
$ javac Calculator.java

Me@PC-ALPHA MINGW64 /c/git/UHasselt/Ses/ses-ci-opgave/src/main/java (master)
$ java -cp . Calculator 1 4 print 5 in stdout.

Uiteraard gebruiken we hier Gradle voor. Zet de berekening in een aparte methode, 
die ook getest werd. Voorzie dus ook Enkele eenvoudige unit testen in src/main/test.

1.2 De app builden op Travis
-----------------------------

Nadat de code voor 1.1 werd gecommit en gepushed op je Git repository, is de volgende stap dit 
project automatisch te builden op een server, zoals Travis. Om dit te activeren moeten er twee stappen worden uitgevoerd:

Activeer je repository door op travis-ci.org in te loggen met je Github account, 
de repository terug te zoeken in de lijst door op + te drukken links, en de slider naar rechts te zetten, 
zodat Travis changes detecteert. Zie screenshot hieronder.

Voorzie een .travis.yml bestand waarin staat beschreven op welke manier je project moet worden gebuild.

Het verschil tussen de .org en .com websites is dat de eerste enkel publieke repositories kan behandelen, 
terwijl de laatste (in BETA) ook private repositories aankan. Vergewis je ervan om enkel via de eerste, 
travis-ci.org, je opgave repository te activeren.

Welke stappen denk je dat Travis zou moeten ondernemen op je project te builden? Is enkel builden voldoende? 
Wat als er een test faalt? Stel dat we de gebuilde jar ergens willen uploaden, hoe gaan we dan tewerk? 
Raadpleeg de documentatie om jezelf te bekwamen in de Yaml syntax:

Opgave 2
---------
Er duikt plots een onvoorziene periode van boekenschaarste op! 
Om niet te veel paniek te veroorzaken, willen we gebruik maken van blue/green releasing 
om het uitleensysteem van SESsy library gradueel te wijzigen.

De klasse BorrowBooksResource is het entry point voor alle calls naar /borrow, 
zoals de @Path annotatie aanduidt. Deze klasse zal voortaan moeten dienen als API gateway die gebruikers omleidt, 
ofwel naar het gebruikelijke uitleenproces, ofwel naar een methode die niet meer toestaat dat boeken worden uitgeleend, 
onafhankelijk van de ingelogde gebruiker of het type boek.

Maak twee nieuwe klasses aan, BorrowBooksOriginalResource (1) met de originele borrow() implementatie, 
en BorrowBooksNotAllowedResource (2), die altijd een status FORBIDDEN teruggeeft. Kennis van patterns is een pluspunt hier.

Denk na over hoe je de bestaande klasse BorrowBooksResource gaat aanpassen om bepaalde gebruikers naar ofwel (1) ofwel (2) te leiden. 
Je kan bijvoorbeeld een aantal boeken (op basis van ISBN) wel of niet toestaan, of gebaseerd op de sessie een aantal 
gebruikers wel of niet toestaan. Neem een kijkje in request.getSession(): wat is bruikbaar, en wat niet?
