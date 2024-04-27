package ro.ctrln.builder;


public class Programmer {
    private String name;
    private String lastName;
    private String programmingLanguage;
    private int skillLevel;

    public Programmer() {
    }

    public Programmer(ProgrammerBuilder programmerBuildere) {
        this.name = programmerBuildere.name;
        this.lastName = programmerBuildere.lastName;
        this.programmingLanguage = programmerBuildere.programmingLanguage;
        this.skillLevel = programmerBuildere.skillLevel;
    }

    public static ProgrammerBuilder builder(){
        return new ProgrammerBuilder();
    }

    public static class ProgrammerBuilder {
        private String name;
        private String lastName;
        private String programmingLanguage;
        private int skillLevel;

        public ProgrammerBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProgrammerBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ProgrammerBuilder programmingLanguage(String programmingLanguage) {
            this.programmingLanguage = programmingLanguage;
            return this;
        }

        public ProgrammerBuilder skillLevel(int skillLevel) {
            this.skillLevel = skillLevel;
            return this;
        }

        public Programmer build(){
            return new Programmer(this);
        }
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", skillLevel=" + skillLevel +
                '}';
    }
}