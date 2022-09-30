// Bitte beantworten Sie die Multiple-Choice-Fragen (maximal 25 Punkte, 1 Punkt pro 'Choice').

public class MCTest2 {

    // Wenn 'answer' in 'new Choice(...)' für davor stehende 'question' zutrifft, 'valid' bitte auf 'true' ändern.
    // Sonst 'valid' auf 'false' belassen.
    // Kommentare wirken sich nicht auf die Beurteilung aus.
    // Bitte sonst nichts ändern. Zur Kontrolle MCTest2 ausführen.
    public static void main(String[] args) {
        checkAndPrint(

                new Question(
                        "public int sumFrom1To(int n) { return (n * (n + 1)) / 2; } \n" +
                        "Welche der folgenden Aussagen können (jede für sich) als Vor- bzw. Nachbedingungen\n" +
                        "dieser Methode sinnvoll sein?",

                        new Choice(true, "Nachbedingung: Ergebnis ist für n <= 0 nicht die Zahlensumme.                      (1A)"),
                        new Choice(false, "Vorbedingung: Lässt den Objektzustand unverändert.                                 (1B)"),
                        new Choice(true, "Vorbedingung: n >= 1.                                                              (1C)"),
                        new Choice(true, "Vorbedingung: Ergebnis hängt nur von n ab.                                         (1D)"),
                        new Choice(true, "Nachbedingung: Gibt (n * (n + 1)) / 2 zurück.                                      (1E)")
                ),

                new Question(
                        "Welche der folgenden Aussagen treffen auf die Qualität großer Programme und\n" +
                        "das zur Erreichung der geforderten Qualität nötige Qualitätsmanagement zu?",

                        new Choice(true, "Qualitätsanforderungen sollen analysiert und dargestellt werden.                   (2A)"),
                        new Choice(true, "Abhängigkeiten zu anderer Software sollen möglichst schwach bleiben.               (2B)"),
                        new Choice(true, "Design-by-Contract kann Missverständnisse früh erkennen lassen.                    (2C)"),
                        new Choice(true, "Unnötige Features können die Brauchbarkeit eines Programms stören.                 (2D)"),
                        new Choice(true, "Konfigurierbarkeit kann die Brauchbarkeit des Programms verbessern.                (2E)")
                ),

                new Question(
                        "public int median(int[] p) { return p[p.length / 2]; } \n" +
                        "Welche der folgenden Aussagen können (jede für sich) als Vor- bzw. Nachbedingungen\n" +
                        "dieser Methode sinnvoll sein?",

                        new Choice(true, "Nachbedingung: Gibt den Median zurück wenn p sortiert ist.                         (3A)"),
                        new Choice(false, "Nachbedingung: p ist absteigend sortiert.                                          (3B)"),
                        new Choice(true, "Vorbedingung: Wirft eine Exception wenn p.length == 0.                             (3C)"),
                        new Choice(true, "Nachbedingung: Lässt p unverändert.                                                (3D)"),
                        new Choice(false, "Nachbedingung: p.length > 0                                                        (3E)")
                ),

                new Question(
                        "Welche der folgenden Aussagen treffen auf Iteratoren in Java zu?",

                        new Choice(false, "Eine Collection kann auch mehrere Iterator-Implementierung enthalten.              (4A)"),
                        new Choice(true, "Lineare Listen sind meist einfacher iterierbar als Binärbäume.                     (4B)"),
                        new Choice(true, "Das Interface Iterator spezifiziert die Methode iterator().                        (4C)"),
                        new Choice(true, "Iteratoren über Bäumen traversieren Bäume meist rekursiv.                          (4D)"),
                        new Choice(true, "Iterator-Implementierungen bestimmen die Reihenfolge der Iterationen.              (4E)")
                ),

                new Question(
                        "Welche der folgenden Aussagen treffen auf Schleifen und Schleifeninvarianten zu?",

                        new Choice(false, "Erfüllte Schleifeninvarianten garantieren Termination.                             (5A)"),
                        new Choice(false, "Die Schleifenbedingung kann nicht Teil einer Schleifeninvariante sein.             (5B)"),
                        new Choice(false, "Eine Schleifeninvariante beschreibt, was jede Iteration ändert.                    (5C)"),
                        new Choice(false, "Durch Schleifeninvarianten sind Schleifen im Debugger iterierbar.                  (5D)"),
                        new Choice(true, "Schleifeninvarianten müssen auch vor und nach der Schleife gelten.                 (5E)")
                )
        );
    }

// Ende der Multiple-Choice-Fragen

//------------------------------------------------------------
// Bitte lassen Sie den Rest der Datei unverändert.
// Please do not edit below this line.

    private static final String EXPECT = // nochmals die gleichen Fragen zur Selbstkontrolle 
            " 1. public int sumFrom1To(int n) { return (n * (n + 1)) / 2; } \n" +
            "    Welche der folgenden Aussagen können (jede für sich) als Vor- bzw. Nachbedingungen\n" +
            "    dieser Methode sinnvoll sein?\n" +
            "    \n" +
            "    XXXXXXXXX Nachbedingung: Ergebnis ist für n <= 0 nicht die Zahlensumme.                      (1A)\n" +
            "    XXXXXXXXX Vorbedingung: Lässt den Objektzustand unverändert.                                 (1B)\n" +
            "    XXXXXXXXX Vorbedingung: n >= 1.                                                              (1C)\n" +
            "    XXXXXXXXX Vorbedingung: Ergebnis hängt nur von n ab.                                         (1D)\n" +
            "    XXXXXXXXX Nachbedingung: Gibt (n * (n + 1)) / 2 zurück.                                      (1E)\n" +
            "\n" +
            " 2. Welche der folgenden Aussagen treffen auf die Qualität großer Programme und\n" +
            "    das zur Erreichung der geforderten Qualität nötige Qualitätsmanagement zu?\n" +
            "    \n" +
            "    XXXXXXXXX Qualitätsanforderungen sollen analysiert und dargestellt werden.                   (2A)\n" +
            "    XXXXXXXXX Abhängigkeiten zu anderer Software sollen möglichst schwach bleiben.               (2B)\n" +
            "    XXXXXXXXX Design-by-Contract kann Missverständnisse früh erkennen lassen.                    (2C)\n" +
            "    XXXXXXXXX Unnötige Features können die Brauchbarkeit eines Programms stören.                 (2D)\n" +
            "    XXXXXXXXX Konfigurierbarkeit kann die Brauchbarkeit des Programms verbessern.                (2E)\n" +
            "\n" +
            " 3. public int median(int[] p) { return p[p.length / 2]; } \n" +
            "    Welche der folgenden Aussagen können (jede für sich) als Vor- bzw. Nachbedingungen\n" +
            "    dieser Methode sinnvoll sein?\n" +
            "    \n" +
            "    XXXXXXXXX Nachbedingung: Gibt den Median zurück wenn p sortiert ist.                         (3A)\n" +
            "    XXXXXXXXX Nachbedingung: p ist absteigend sortiert.                                          (3B)\n" +
            "    XXXXXXXXX Vorbedingung: Wirft eine Exception wenn p.length == 0.                             (3C)\n" +
            "    XXXXXXXXX Nachbedingung: Lässt p unverändert.                                                (3D)\n" +
            "    XXXXXXXXX Nachbedingung: p.length > 0                                                        (3E)\n" +
            "\n" +
            " 4. Welche der folgenden Aussagen treffen auf Iteratoren in Java zu?\n" +
            "    \n" +
            "    XXXXXXXXX Eine Collection kann auch mehrere Iterator-Implementierung enthalten.              (4A)\n" +
            "    XXXXXXXXX Lineare Listen sind meist einfacher iterierbar als Binärbäume.                     (4B)\n" +
            "    XXXXXXXXX Das Interface Iterator spezifiziert die Methode iterator().                        (4C)\n" +
            "    XXXXXXXXX Iteratoren über Bäumen traversieren Bäume meist rekursiv.                          (4D)\n" +
            "    XXXXXXXXX Iterator-Implementierungen bestimmen die Reihenfolge der Iterationen.              (4E)\n" +
            "\n" +
            " 5. Welche der folgenden Aussagen treffen auf Schleifen und Schleifeninvarianten zu?\n" +
            "    \n" +
            "    XXXXXXXXX Erfüllte Schleifeninvarianten garantieren Termination.                             (5A)\n" +
            "    XXXXXXXXX Die Schleifenbedingung kann nicht Teil einer Schleifeninvariante sein.             (5B)\n" +
            "    XXXXXXXXX Eine Schleifeninvariante beschreibt, was jede Iteration ändert.                    (5C)\n" +
            "    XXXXXXXXX Durch Schleifeninvarianten sind Schleifen im Debugger iterierbar.                  (5D)\n" +
            "    XXXXXXXXX Schleifeninvarianten müssen auch vor und nach der Schleife gelten.                 (5E)\n" +
            "\n";

    public static final long UID = 245143841285658L;

    private static void checkAndPrint(Question... questions) {
        int i = 1;
        String s = "";
        for (Question question : questions) {
            java.util.Scanner scanner = new java.util.Scanner(question.toString());
            s += String.format("%2d. %s\n", i++, scanner.nextLine());
            while (scanner.hasNextLine()) {
                s += String.format("    %s\n", scanner.nextLine());
            }
            s += "\n";
        }
        String converted = s.replace("Richtig: ", "XXXXXXXXX").replace("Falsch:  ", "XXXXXXXXX");
        if (!converted.replaceAll("[ \t]+", " ").equals(EXPECT.replaceAll("[ \t]+", " "))) {
            i = 0;
            String err = "\n";
            java.util.Scanner e = new java.util.Scanner(EXPECT);
            java.util.Scanner f = new java.util.Scanner(converted);
            while (e.hasNextLine() && f.hasNextLine() && i < 5) {
                String el = e.nextLine(), fl = f.nextLine();
                if (!el.replaceAll("[ \t]+", " ").equals(fl.replaceAll("[ \t]+", " "))) {
                    i++;
                    err += "Statt der Zeile: " + fl + "\nsollte stehen:   " + el + "\n\n";
                }
            }
            if (i >= 5) {
                err = "Das sind die erwarteten Fragen und Antwortmöglichkeiten in 'EXPECT':\n\n" + EXPECT;
            }
            System.out.println("ACHTUNG: Sie haben Programmteile verändert, die nicht geändert werden sollten.\n" +
                    "Beurteilt wird so, als ob diese Programmteile unverändert geblieben wären.\n" +
                    err);
            System.exit(1);
        }
        System.out.print("Die Multiple-Choice-Fragen wurden folgendermaßen beantwortet\n" +
                "(das sind nur Ihre Antworten, keine Aussage über Korrektheit):\n\n" +
                s);
        System.exit(0);
    }

    private static class Question {
        private final String question;
        private final Choice[] choices;

        public Question(String question, Choice... choices) {
            this.question = question;
            this.choices = choices;
        }

        public String toString() {
            String s = question + "\n\n";
            for (Choice choice : choices) {
                s += choice + "\n";
            }
            return s;
        }
    }

    private static class Choice {
        private final String answer;
        private final boolean valid;

        public Choice(boolean valid, String answer) {
            this.answer = answer;
            this.valid = valid;
        }

        public String toString() {
            return (valid ? "Richtig:  " : "Falsch:   ") + answer;
        }
    }
}