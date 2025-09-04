import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class test {
    @Test
    public void testGetExams() {
        // Créez une instance de Matiere
        Matiere matiere = new Matiere(1, "PROG2", null);

        // Ajoutez des examens à la matière
        Exam exam1 = new Exam(1, "Examen 1", null, 2);
        Exam exam2 = new Exam(2, "Examen 2", null, 3);
        matiere.getExams().add(exam1);
        matiere.getExams().add(exam2);

        // Vérifiez que les examens ont été ajoutés correctement
        assertEquals(2, matiere.getExams().size());
        assertEquals("Examen 1", matiere.getExams().get(0).getLabel());
        assertEquals("Examen 2", matiere.getExams().get(1).getLabel());
    }
    @Test 
    public void testGetMatiereGarde() {
        // Créez une instance de Matiere
        Matiere matiere = new Matiere(1, "PROG2", null);

        // Ajoutez des notes et des examens à la matière
        Note note1 = new Note(1, 15.0, null);
        Note note2 = new Note(2, 18.0, null);
        matiere.getNotes().add(note1);
        matiere.getNotes().add(note2);

        Exam exam1 = new Exam(1, "Examen 1", matiere, LocalDateTime.now(), 2);
        Exam exam2 = new Exam(2, "Examen 2", matiere, LocalDateTime.now(), 3);
        matiere.getExams().add(exam1);
}