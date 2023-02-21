package cz.kahle.test

import com.homeaway.devtools.jenkins.testing.JenkinsPipelineSpecification

class AClassTest extends JenkinsPipelineSpecification{
    def "test AClass"() {
        given:
        AClass aClass = new AClass(this)

        when:
        aClass.run()
        then:
        1 * getPipelineMock("aScript.log")('aMessages')

    }
}
