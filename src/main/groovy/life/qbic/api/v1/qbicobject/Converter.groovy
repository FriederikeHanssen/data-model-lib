package life.qbic.api.v1.qbicobject
/**
 * Converts openBIS objects to QBiC objects.
 *
 *
 *
 * @author: Sven Fillinger
 */
class Converter {

    /**
     * Links the correct adapter to a given openBIS object.
     */
    private final static Map ADAPTER_LEXICON = [
            ("ch.ethz.sis.openbis.generic.asapi.v3.dto.sample.Sample".replace('.', '')): {object ->
                def s = new QbicSampleV1(object)}
    ]

    /**
     * Provides an openBIS object converter instance.
     */
    Converter() {
        ADAPTER_LEXICON.each { object, adapter ->
            this.metaClass."$object" { obj -> adapter } // Creates methods based on the object class name
        }
    }

    /**
     * Converts an openBIS object into an QBiC object, if an adapter is implemented.
     * @param T An openBIS object to convert
     * @return A QBiC object or the original object, if no adapter was found
     */
     Object convert(Object object) {
        getAdapterForClass(object.class)(object)
    }

    /**
     * Finds the correct adapter class if implemented.
     *
     * @param c The class to get an adapter for
     * @return An adapter closure, which expects a
     */
    private Closure getAdapterForClass(Class c) {
        def adapter
        try {
            def method = c.name.replace('.', '')
            adapter = this."$method"() // returns the correct adapter
        } catch (MissingMethodException e) {
            adapter = { object -> object } // returns the input object without adapter
        }
        return adapter
    }


}