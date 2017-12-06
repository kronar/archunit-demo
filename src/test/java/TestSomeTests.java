
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.core.importer.ImportOptions;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 *
 */
public class TestSomeTests {


    private final ClassFileImporter importer = new ClassFileImporter();

    private JavaClasses classes;


    @Before
    public void importClasses() {
        classes = importer.importClasspath(); // imports all classes from the classpath that are not from JARs
//        classes = importer.importClasspath(new ImportOptions().with(new ImportOption.Everything())); // imports all classes from the classpath , tests also
    }


    @Test
    public void testNoDirectUsagesOfSelenium() {
        ArchRule rule = ArchRuleDefinition
                .noClasses()
                .that()
                .resideInAPackage("org.example.out.test")
                .should()
                .accessClassesThat()
                .resideInAPackage("..org.openqa.selenium..");
        rule.check(classes);
    }


    @Test
    public void testNoByIdInvocation(){
        ArchRule rule = ArchRuleDefinition
                .noClasses()
                .that()
                .resideInAPackage("org.example.out.test")
                .should().callMethod(By.class, "id", String.class);
        rule.check(classes);
    }


}



