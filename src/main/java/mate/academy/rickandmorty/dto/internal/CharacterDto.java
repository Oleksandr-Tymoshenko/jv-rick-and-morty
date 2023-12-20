package mate.academy.rickandmorty.dto.internal;

public record CharacterDto(
        Long id,
        Long externalId,
        String name,
        String status,
        String species,
        String type,
        String gender
) {
}
