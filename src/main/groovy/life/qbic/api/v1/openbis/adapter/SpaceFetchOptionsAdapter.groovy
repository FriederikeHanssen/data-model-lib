package life.qbic.api.v1.openbis.adapter

interface SpaceFetchOptionsAdapter {

    FetchOptionsToStringBuilderAdapter getFetchOptionsStringBuilder()

    SpaceSortOptionsAdapter getSortBy()

    boolean hasProjects()

    boolean hasRegistrator()

    boolean hasSamples()

    SpaceSortOptionsAdapter sortBy()

    ProjectFetchOptionsAdapter withProjects()

    ProjectFetchOptionsAdapter withProjectsUsing(Object fetchOptions)

    PersonFetchOptionsAdapter withRegistrator()

    PersonFetchOptionsAdapter withRegistratorUsing(Object fetchOptions)

    SampleFetchOptionsAdapter withSamples()

    SampleFetchOptionsAdapter withSamplesUsing(Object fetchOptions)
}
