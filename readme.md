`10. Oktober 2023` `neueFische - Java Development Bootcamp`
# Recap Projekt - ToDO
## Vorbereitung
#### Heute widmen wir uns dem ToDo-Backend. Folge den Schritten, um die Aufgabe zu erledigen.
1. Clont das [ToDo-Repository](https://github.com/neuefische/java-todo-frontend)
2. In IntelliJ unter "Git", "Manage Remotes" entfernt die bisherige Verknüpfung zum Original-Repository. Dann mit "Git", "GitHub", "Share Project on GitHub" ladet das Projekt in einen Eurer GitHub-Accounts hoch.
3. ertselle ein neues Spring-Boot Module und nenne es 'backend'
4. Baut das Frontend mithilfe des shell scripts
5. Startet den Server und rufe ihn im Browser auf ((Wenn ihr alles richtig gemacht habt dann seht ihr im Browser jetzt das Frontend))
## Aufgaben
### Zugriffe analysieren
1. Nutzt die Entwicklertools in Eurem Browser (den "Netzwerk"-Tab), um die Zugriffe des Frontends zu analysieren. Welche Endpunkte werden angesprochen (URLs und HTTP-Methoden)? Welche Daten werden an den Server gesendet?
#### Backend entwickeln
3. Implementiert die HTTP-Endpunkte, die Euer Frontend benötigt.
   ##### Geht dabei Schritt für Schritt die Endpunkte durch und schreibt auch Tests für eure Methoden.
## Bonus Aufgaben
1. Lasst ChatGPT bei jedem neuen ToDo-Item eine Rechtschreib- und Grammatikkorrektur der Ticket-Texte durchführen.
2. Schreibt auch dafür Integrationtests (die ChatGPT mit MockWebServer mocken!).
### Monitoring
3. Fügt eine aktuelle Dependency zu `JavaMelody` zu Eurem Backend hinzu. Eurer Backend sollte nun unter `/monitoring ein Dashboard anzeigen, das Euch über die Performance Eures Backends informiert.
4. Klickt einige Male im Frontend herum und schaut Euch die Messwerte Eures Backends an.
5. Könnt Ihr Euch eine Situation vorstellen, in der das Monitoring Eures Backends hilfreich sein könnte?
   >
### ChatGPT Initialisierung
6. Schreibt einen neuen Endpunkt "POST /initialize/{Themengebiet}" um ca 20-30 neue Todo-Items von der ChatGPT-API generieren zu lassen.
7. Schreibt auch hier Integrationstests (die ChatGPT mit MockWebServer mocken!).
### Undo-Endpunkt
8. Implementiert einen HTTP-Endpunkt im Backend unter `/undo, der die letzte Änderung rückgängig macht.
   ##### Eine Anpassung im Frontend ist nicht notwendig. Ruft den Endpunkt einfach via Postman auf und schaut, ob die letzte Änderung rückgängig gemacht wurde.
9. Schreibt gute Integrationstests für diesen Endpunkt.
10. Es soll auch möglich sein den Endpunkt mehrfach aufzurufen, um mehrere Änderungen rückgängig zu machen.
### Redo-Endpunkt
11. Schreibt nun auch einen `/redo-Endpunkt um ein vorheriges Undo wieder rückgängig zu machen.