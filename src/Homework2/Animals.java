package Homework2;

    public abstract class Animals {
        private String type;
        private String name;
        private float Run;
        private float Swim;
        private float Jump;

        Animals(String type, String name, float maxJump, float maxRun, float maxSwim) {
            this.type = type;
            this.name = name;
            this.Jump = maxJump;
            this.Run = maxRun;
            this.Swim = maxSwim;
        }
        String getName() {
            return this.name;
        }

        String getType() {
            return this.type;
        }

        float getRun() { return this.Run; }

        float getSwim() {
            return this.Swim;
        }

        float getJump() {
            return this.Jump;
        }

}
