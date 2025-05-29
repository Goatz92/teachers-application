package gr.aueb.cf.teachersapp.service;

import gr.aueb.cf.teachersapp.core.exceptions.EntityAlreadyExistsException;
import gr.aueb.cf.teachersapp.core.exceptions.EntityInvalidArgumentException;
import gr.aueb.cf.teachersapp.dto.TeacherInsertDTO;
import gr.aueb.cf.teachersapp.dto.TeacherReadOnlyDTO;
import gr.aueb.cf.teachersapp.model.Teacher;
import org.springframework.data.domain.Page;

public interface ITeacherService {
    Teacher saveTeacher(TeacherInsertDTO dto)
            throws EntityAlreadyExistsException, EntityInvalidArgumentException;
    Page<TeacherReadOnlyDTO> getPaginatedTeachers(int page, int size);
}
