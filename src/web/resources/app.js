
var studentsApp = angular.module('studentsApp', ['ngRoute']);


studentsApp.controller('studentsCtrl', function ($scope, $http) {

    $http.get('/students').then(function (response) {
        $scope.students = response.data;
    });

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

});

studentsApp.config(['$routeProvider', '$locationProvider',
    function ($routeProvider, $locationProvider) {
        $routeProvider.
        when('/home', {
            templateUrl: 'views/home.html',
            controller: 'studentsCtrl'
        }).
        otherwise({
            redirectTo: '/home'
        });
        $locationProvider.html5Mode(true);
    }]);
