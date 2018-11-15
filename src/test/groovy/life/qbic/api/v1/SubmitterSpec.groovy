package life.qbic.api.v1

import ch.ethz.sis.openbis.generic.asapi.v3.dto.sample.Sample
import life.qbic.api.v1.openbis.adapter.SampleAdapter
import life.qbic.api.v1.qbicobject.QbicSampleV1
import life.qbic.api.v1.qbicobject.QbicSampleV1
import spock.lang.Specification

class SubmitterSpec extends Specification{

    def final tCode = 'QHIPP001AE'

    def final openBisSample = new Sample().tap {
        code = tCode
    }

    def "check successful sample conversion"() {
        given:
        def submitter = new Submitter()
        def exampleQuery = {
            def list = [openBisSample]
        }

        when:
        def result = submitter.submit(exampleQuery)

        then:
        result instanceof List
        result.each {
            it instanceof SampleAdapter
        }



    }

    /**
     * QbicSampleV1 objects should not be accessible from the outside.
     * Instead only the Interface (SampleAdapter) should be exposed
     *
     */
    def "check QbicSample encapsulation"(){
        given:
        def submitter = new Submitter()
        def exampleQuery = {
            def list = [openBisSample]
        }

        when:
        def result = submitter.submit(exampleQuery)
        result.each {
            it instanceof QbicSampleV1
        }

        then:
        thrown IllegalAccessError
    }



}
