package life.qbic.api.v1.openbis.adapter

interface PersonFetchOptionsAdapter {

    FetchOptionsToStringBuilderAdapter getFetchOptionsStringBuilder()

    PersonSortOptionsAdapter getSortBy()

    boolean hasAllWebAppSettings()

    boolean hasRegistrator()

    boolean hasRoleAssignments()

    boolean hasSpace()

    boolean hasWebAppSettings(Object webAppId)

    PersonSortOptionsAdapter sortBy()

    boolean withAllWebAppSettingsUsing(boolean allWebAppSettings)

    PersonFetchOptionsAdapter withRegistrator()

    PersonFetchOptionsAdapter withRegistratorUsing(Object fetchOptions)

    RoleAssignmentFetchOptionsAdapter withRoleAssignments()

    RoleAssignmentFetchOptionsAdapter withRoleAssignmentsUsing(Object fetchOptions)

    SpaceFetchOptionsAdapter withSpace()

    SpaceFetchOptionsAdapter withSpaceUsing(Object fetchOptions)


}