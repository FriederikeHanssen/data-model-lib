package life.qbic.api.v1.openbis.adapter

interface ExperimentFetchOptionsAdapter {

    FetchOptionsToStringBuilderAdapter getFetchOptionsStringBuilder()

    ExperimentSortOptionsAdapter getSortBy()

    boolean hasAttachments()

    boolean hasDataSets()

    boolean hasHistory()

    boolean hasMaterialProperties()

    boolean hasModifier()

    boolean hasProject()

    boolean hasProperties()

    boolean hasRegistrator()

    boolean hasSamples()

    boolean hasTags()

    boolean hasType()

    ExperimentSortOptionsAdapter sortBy()

    AttachmentFetchOptionsAdapter withAttachments()

    AttachmentFetchOptionsAdapter withAttachmentsUsing(Object fetchOptions)

    DataSetFetchOptionsAdapter withDataSets()

    DataSetFetchOptionsAdapter withDataSetsUsing(Object fetchOptions)

    HistoryEntryFetchOptionsAdapter withHistory()

    HistoryEntryFetchOptionsAdapter withHistoryUsing(Object fetchOptions)

    MaterialFetchOptionsAdapter withMaterialProperties()

    MaterialFetchOptionsAdapter withMaterialPropertiesUsing(Object fetchOptions)

    PersonFetchOptionsAdapter withModifier()

    PersonFetchOptionsAdapter withModifierUsing(Object fetchOptions)

    ProjectFetchOptionsAdapter withProject()

    ProjectFetchOptionsAdapter withProjectUsing(Object fetchOptions)

    PropertyFetchOptionsAdapter withProperties()

    PropertyFetchOptionsAdapter withPropertiesUsing(Object fetchOptions)

    PersonFetchOptionsAdapter withRegistrator()

    PersonFetchOptionsAdapter withRegistratorUsing(Object fetchOptions)

    SampleFetchOptionsAdapter withSamples()

    SampleFetchOptionsAdapter withSamplesUsing(Object fetchOptions)

    TagFetchOptionsAdapter withTags()

    TagFetchOptionsAdapter withTagsUsing(Object fetchOptions)

    ExperimentTypeFetchOptionsAdapter withType()

    ExperimentTypeFetchOptionsAdapter withTypeUsing(Object fetchOptions)
}