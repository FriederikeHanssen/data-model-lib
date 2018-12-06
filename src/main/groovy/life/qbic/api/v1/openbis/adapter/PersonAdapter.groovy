package life.qbic.api.v1.openbis.adapter

interface PersonAdapter {

    String getEmail()

    PersonFetchOptionsAdapter getFetchOptions()

    String getFirstName()

    String getLastName()

    PersonPermIdAdapter getPermId()

    Date getRegistrationDate()

    PersonAdapter getRegistrator()

    List<RoleAssignmentAdapter> getRoleAssignments()

    SpaceAdapter getSpace()

    String getUserId()

    boolean isActive()
}