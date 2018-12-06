package life.qbic.api.v1.openbis.adapter

interface TagFetchOptionsAdapter {

    FetchOptionsToStringBuilderAdapter getFetchOptionsStringBuilder()

    TagSortOptionsAdapter getSortBy()

    boolean hasDataSets()

    boolean hasExperiments()

    boolean hasMaterials()

    boolean hasOwner()

    boolean hasSamples()

    TagSortOptionsAdapter sortBy()

    DataSetFetchOptionsAdapter withDataSets()

    DataSetFetchOptionsAdapter withDataSetsUsing(Object fetchOptions)

    ExperimentFetchOptionsAdapter withExperiments()

    ExperimentFetchOptionsAdapter withExperimentsUsing(Object fetchOptions)

    MaterialFetchOptionsAdapter withMaterials()

    MaterialFetchOptionsAdapter withMaterialsUsing(Object fetchOptions)

    PersonFetchOptionsAdapter withOwner()

    PersonFetchOptionsAdapter withOwnerUsing(Object fetchOptions)

    SampleFetchOptionsAdapter withSamples()

    SampleFetchOptionsAdapter withSamplesUsing(Object fetchOptions)
}
