
package com.enrol

class BootStrap {

    def init = { servletContext ->
    //new instance of class course
    def courseone=new Course(
        department: 'Computing',
        courseTitle: 'Bsc HonComputing',
        courseLeader: 'Dr Michelle Murphy',
        courseCode: 'CS123',
        startDate: new Date('04/08/1997'),
        endDate: new Date('04/08/1996'),
        description: 'This is about computing.',
        numberOfStudents: '55',
        tuitionFees: '9000.60',
        studyMode: "'yes'").save()
    //new instance of class course
    def coursetwo=new Course(
        department: 'Computing',
        courseTitle: 'System Architecture',
        courseLeader: 'Dr Mike Brown',
        courseCode: 'CS234',
        startDate: new Date('04/08/1997'),
        endDate: new Date('04/08/1996'),
        description: 'This is about computing.',
        numberOfStudents: '55',
        tuitionFees: '9300.60',
        studyMode: "'yes'").save()

    //new instance of class student
    def student1=new Student(
        studentName: 'test user',
        studentID: '1',
        dob: new Date('04/08/1997'),
        isFundingAvailable: new Boolean('True'),
        studentEmail: 'test@test.com',
        studentUsername: 'testuser1', 
        studentPassword: 'testuser12!').save()  
    //new instance of class student
    def student2=new Student(
        studentName: 'test user 2',
        studentID: '2',
        dob: new Date('04/06/2004'),
        isFundingAvailable: new Boolean('True'),
        studentEmail: 'test2@test2.com',
        studentUsername: 'testuser2', 
        studentPassword: 'testuser12!').save()  
    //new instance of class Lecturer
    def lecturerone=new Lecturer(
        lecturerName: 'Charlie Char',
        post: 'not sure',
        lecturerDepartment: 'computing',
        subject: 'computational thinking', 
        research: 'things').save()
    //new instance of class Lecturer
    def lecturertwo=new Lecturer(
        lecturerName: 'James Ja',
        post: 'not sure',
        lecturerDepartment: 'computer',
        subject: 'Internet of Things', 
        research: 'things').save()  
    //new instance of class Module
    def moduleone=new Module(
        moduleTitle: 'Website development',
        moduleCode: 'N10',
        moduleDepartment: 'computing',
        credits: '50',
        moduledesc: 'web development on computing course.').save()
    //new instance of class Module
    def moduletwo=new Module(
        moduleTitle: 'PHP',
        moduleCode: 'K110',
        moduleDepartment: 'computing',
        credits: '50',
        moduledesc: 'PHP on computing course.').save()    
    }
    def destroy = {
    }
}
