
var studentsApp = angular.module('studentsApp', ['ngRoute']);


studentsApp.controller('studentsCtrl', function ($scope, $http) {

    $http.get('/students').then(function (response) {
        $scope.students = response.data;
    });

    //$scope.delete = function()

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
