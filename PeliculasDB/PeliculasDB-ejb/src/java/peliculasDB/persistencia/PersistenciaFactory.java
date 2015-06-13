package peliculasDB.persistencia;

abstract class PersistenciaFactory {
    public abstract ActorPers CreateActorPers();
    public abstract CriticoPers CreateCriticoPers();
    public abstract DirectorPers CreateDirectorPers();    
    public abstract GeneroPers CreateGeneroPers();
    public abstract PeliculaPers CreatePeliculaPers();
    public abstract PersonaPers CreatePersonaPers();
    public abstract ReseniaPers CreateReseniaPers();
    public abstract UsuarioPers CreateUsuarioPers();
}
