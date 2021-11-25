<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<jsp:include page="head.jsp"></jsp:include>
<body>
	<jsp:include page="theme-loader.jsp"></jsp:include>
	<!-- Pre-loader end -->
	<div id="pcoded" class="pcoded">
		<div class="pcoded-overlay-box"></div>
		<div class="pcoded-container navbar-wrapper">

			<!--  navbar -->
			<jsp:include page="navbar.jsp"></jsp:include>
			<!-- navbar -->

			<div class="pcoded-main-container">
				<div class="pcoded-wrapper">

					<!-- navbarmainmenu -->
					<jsp:include page="navbarmainmenu.jsp"></jsp:include>
					<!-- navbarmainmenu -->

					<div class="pcoded-content">
						<!-- Page-header start -->
						<jsp:include page="page-header.jsp"></jsp:include>

						<!-- Page-header end -->
						<div class="pcoded-inner-content">
							<!-- Main-body start -->
							<div class="main-body">
								<div class="page-wrapper">

									<!-- Page-body start -->
									<div class="page-body">
										<div class="row">
											<h1>Cadastro de usu�rio</h1>

											<form action="">
												<div class="form-group row">
													<label class="col-sm-2 col-form-label">Simple Input</label>
													<div class="col-sm-10">
														<input type="text" class="form-control">
													</div>
												</div>
											</form>

										</div>
									</div>
									<!-- Page-body end -->

								</div>
								<div id="styleSelector"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="javascriptfile.jsp"></jsp:include>
</body>
</html>
