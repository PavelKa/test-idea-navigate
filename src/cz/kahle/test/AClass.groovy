package cz.kahle.test
class AClass {
    AClass(steps) {
        this.steps = steps
    }
    def steps

    def run() {
        steps.aScript.log('aMessage')
    }
}
