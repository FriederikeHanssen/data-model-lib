package life.qbic.api.v1.openbis.adapter

interface ProjectFetchOptionsAdapter {

    FetchOptionsToStringBuilderAdapter getFetchOptionsStringBuilder()

    ProjectSortOptionsAdapter getSortBy()

    boolean hasAttachments()

    boolean hasExperiments()

    boolean hasHistory()

    boolean hasLeader()

    boolean hasModifier()

    boolean hasRegistrator()

    boolean hasSamples()

    boolean hasSpace()

    ProjectSortOptionsAdapter sortBy()

    AttachmentFetchOptionsAdapter withAttachments()

    AttachmentFetchOptionsAdapter withAttachmentsUsing(Object fetchOptions)

    ExperimentFetchOptionsAdapter withExperiments()

    ExperimentFetchOptionsAdapter withExperimentsUsing(Object fetchOptions)

    HistoryEntryFetchOptionsAdapter withHistory()

    HistoryEntryFetchOptionsAdapter withHistoryUsing(Object fetchOptions)

    PersonFetchOptionsAdapter withLeader()

    PersonFetchOptionsAdapter withLeaderUsing(Object fetchOptions)

    PersonFetchOptionsAdapter withModifier()

    PersonFetchOptionsAdapter withModifierUsing(Object fetchOptions)

    PersonFetchOptionsAdapter withRegistrator()

    PersonFetchOptionsAdapter withRegistratorUsing(Object fetchOptions)

    SampleFetchOptionsAdapter withSamples()

    SampleFetchOptionsAdapter withSamplesUsing(Object fetchOptions)

    SpaceFetchOptionsAdapter withSpace()

    SpaceFetchOptionsAdapter withSpaceUsing(Object fetchOptions)
}
