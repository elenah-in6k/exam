
var studentsApp = angular.module('studentsApp', ['ngRoute']);


studentsApp.controller('studentsCtrl', function ($scope, $http) {

    $scope.addStudent = function (student) {
        $http
            .post('/students/', {name: student.name})
            .then(function (response) {
                $scope.student.name = "";
                update();
            });
    };

    $scope.deleteStudent = function(student){
        $http
            .delete('/students/' + student.id)
            .then(function (response) {
                update();
            })
    };

    var update = function () {
        $http
            .get('/students').then(function (response) {
            $scope.students = response.data;
        });
    };
    update();
});

studentsApp.controller('subjectsCtrl', function ($scope, $http) {

    $scope.addSubject = function (subject) {
        $http
            .post('/subjects/', {name: subject.name})
            .then(function (response) {
                $scope.subject.name = "";
                update();
            });
    };

    $scope.deleteSubject = function(subject){
        $http
            .delete('/subjects/' + subject.id)
            .then(function (response) {
                update();
            })
    };

    var update = function () {
        $http
            .get('/subjects').then(function (response) {
            $scope.subjects = response.data;
        });
    };
    update();
});

studentsApp.controller('marksCtrl', function ($scope, $http) {

    $scope.addMark = function (mark) {
        $http
            .post('/marks/', {name: mark.name})
            .then(function (response) {
                $scope.mark.name = "";
                update();
            });
    };

    $scope.deleteMark = function(mark){
        $http
            .delete('/marks/' + mark.idStudent )
            .then(function (response) {
                update();
            })
    };

    var update = function () {
        $http
            .get('/marks').then(function (response) {
            $scope.marks = response.data;
        });
        $http
            .get('/marks/top').then(function (response) {
            $scope.markstop = response.data;
        });
    };
    update();
});

studentsApp.config(['$routeProvider', '$locationProvider',
    function ($routeProvider, $locationProvider) {
        $routeProvider.
        when('/home', {
            templateUrl: 'resources/views/home.html',
            controller: 'marksCtrl'
        }).
        when('/students', {
            templateUrl: 'resources/views/students.html',
            controller: 'studentsCtrl'
        }).
        when('/subjects', {
            templateUrl: 'resources/views/subjects.html',
            controller: 'subjectsCtrl'
        }).
        otherwise({
            redirectTo: '/home'
        });
        $locationProvider.html5Mode(true);
    }]);
