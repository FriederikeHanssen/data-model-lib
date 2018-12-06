package life.qbic.api.v1.openbis.adapter

/**
 * Provides an access interface for `QbicSpaceVX` objects.
 * http://svnsis.ethz.ch/doc/openbis/18.06.2/javadoc/ serves as guide for necessary methods
 * Currently focusing on getters alone
 * @author: Friederike Hanssen, QBiC
 * TODO: add setters
 */
interface SpaceAdapter {

    String getCode()

    String getDescription()

    SpaceFetchOptionsAdapter getFetchOptions()

    Date getModificationDate()

    SpacePermIdAdapter getPermId()

    List<ProjectAdapter> getProjects()

    Date getRegistrationDate()

    PersonAdapter getRegistrator()

    List<SampleAdapter> getSamples()

}